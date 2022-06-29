package com.hdfc.ef.Aadhar;

import java.util.HashMap;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class Config extends WsConfigurerAdapter {
	private Config Config;

	@Bean
	public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(applicationContext);
		servlet.setTransformWsdlLocations(true);
		return new ServletRegistrationBean(servlet, "/ws/*");
	}

	@Bean(name = "AadharOTPGenWsdl")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema OTPSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("Aadhar");
		wsdl11Definition.setLocationUri("/ws/Aadhar");
		wsdl11Definition.setTargetNamespace("http://uidaiekyc.otp.xsd.hdfcbank.com");
		wsdl11Definition.setSchema(OTPSchema);
		return wsdl11Definition;
	}	
	
	@Bean
	public XsdSchema OTPSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/AadharOtpGen.xsd"));
	}
	
	@Bean(name = "AadharOTPValWsdl")
	public DefaultWsdl11Definition AdharOTPValWsdl11Definition(XsdSchema ValidateOTPSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("AadharVal");
		wsdl11Definition.setLocationUri("/ws/AadharOTPVal");
		wsdl11Definition.setTargetNamespace("http://uidaiekyc.otpval.xsd.hdfcbank.com");
		wsdl11Definition.setSchema(ValidateOTPSchema);
		return wsdl11Definition;
	}		
	@Bean
	public XsdSchema ValidateOTPSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/ValidateAdharOTP.xsd"));
	}
	
	@Bean(name = "NameMatchWsdl")
	public DefaultWsdl11Definition NameMatchWsdl11Definition(XsdSchema NameMatchSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("NameMatch");
		wsdl11Definition.setLocationUri("/ws/NameMatch");
		wsdl11Definition.setTargetNamespace("http://uidaiekyc.addMatch.xsd.hdfcbank.com");
		wsdl11Definition.setSchema(NameMatchSchema);
		return wsdl11Definition;
	}		
	@Bean
	public XsdSchema NameMatchSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/NameMatch.xsd"));
	}
}