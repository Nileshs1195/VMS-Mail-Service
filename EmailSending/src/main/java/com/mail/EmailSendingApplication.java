package com.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 
 * @author Nilesh
 *
 */

@SpringBootApplication
public class EmailSendingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailSendingApplication.class, args);
	}

}
