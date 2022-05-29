package com.hdfc.ef.SMSSender;

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
	@Bean(name = "SMSSenderWsdl")
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema SMSSchema) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("SMSSenderPort");
		wsdl11Definition.setLocationUri("/ws/SMSSender");
		wsdl11Definition.setTargetNamespace("http://www.hdfcbank.com/SMSService/");
		wsdl11Definition.setSchema(SMSSchema);
		return wsdl11Definition;
	}
	
	
	@Bean
	public XsdSchema SMSSchema() {
		return new SimpleXsdSchema(new ClassPathResource("/SMSSender.xsd"));
	}	
}