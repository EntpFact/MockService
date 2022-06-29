package com.hdfc.ef.PANValidation;

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

	@Bean(name = "PANValidationWsdl")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema PANSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("PANValidation");
		wsdl11Definition.setLocationUri("/ws/PANValidation");
		wsdl11Definition.setTargetNamespace("http://hdfcbank/ws/PANVal");
		wsdl11Definition.setSchema(PANSchema);
		return wsdl11Definition;
	}	
	
	@Bean
	public XsdSchema PANSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/PANValidation.xsd"));
	}
	
	@Bean(name = "DedupeCheckWsdl")
	public DefaultWsdl11Definition dedupeWsdl11Definition(XsdSchema DedupeSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("DedupeCheck");
		wsdl11Definition.setLocationUri("/ws/DedupeCheck");
		wsdl11Definition.setTargetNamespace("http://hdfcbank/ws/DedupeCheck");
		wsdl11Definition.setSchema(DedupeSchema);
		return wsdl11Definition;
	}	
	
	@Bean
	public XsdSchema DedupeSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/DedupeCheck.xsd"));
	}
	
	@Bean(name = "EnquireBureauWsdl")
	public DefaultWsdl11Definition EnquireBureauWsdl11Definition(XsdSchema EnquireBureauSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("EnquireBureau");
		wsdl11Definition.setLocationUri("/ws/EnquireBureau");
		wsdl11Definition.setTargetNamespace("multibureau.xsd.hdfcbank.com");
		wsdl11Definition.setSchema(EnquireBureauSchema);
		return wsdl11Definition;
	}	
	
	@Bean
	public XsdSchema EnquireBureauSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/EnquireBureau.xsd"));
	}
}