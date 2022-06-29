package com.hdfc.ef.PANValidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = { ResponseStatusLoaderController.class,com.hdfc.ef.CheckETBorNTB.CheckETBorNTBController.class})
public class PanValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PanValidationApplication.class, args);
	}

}
