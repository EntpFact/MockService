package com.hdfc.ef.OTPGenerationVerification;

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
	@Bean(name = "OTPGeneratorWsdl")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema OTPSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("OTPGeneratorPort");
		wsdl11Definition.setServiceName("OTPGenerator");
		wsdl11Definition.setLocationUri("/ws/OTPGenerator");
		wsdl11Definition.setTargetNamespace("http://www.hdfcbank.com/OTPService/");
		wsdl11Definition.setSchema(OTPSchema);
		return wsdl11Definition;
	}
	
	@Bean
	public XsdSchema OTPSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/OTPGeneration.xsd"));
	}	
	@Bean(name = "OTPValidationWsdl")
	public DefaultWsdl11Definition VerificationWsdl11Definition(XsdSchema VerificationSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("OTPValidationPort");
		wsdl11Definition.setServiceName("OTPValidation");
		wsdl11Definition.setLocationUri("/ws/OTPValidator");
		wsdl11Definition.setTargetNamespace("http://www.hdfcbank.com/OTPValidation/");
		wsdl11Definition.setSchema(VerificationSchema);
		return wsdl11Definition;
	}	
	@Bean
	public XsdSchema VerificationSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/OTPValidation.xsd"));
	}	
}