package com.oss.webbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Profile;

/*@SpringBootApplication//(scanBasePackageClasses = {opsw.erp.items.jpa.Items.class, opsw.erp.items.jpa.ItemsKey.class})
public class WebBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebBackendApplication.class, args);
	}
}*/

@SpringBootApplication
public class WebBackendApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(com.oss.webbackend.WebBackendApplication.class, args);
	}

	/*
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(com.oss.webbackend.WebBackendApplication.class);
	}
	
	 */
}
