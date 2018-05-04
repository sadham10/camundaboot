package org.camunda.bpm.getstarted.loanapproval;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableProcessApplication
@EnableWebMvc
public class WebappExampleProcessApplication {

	public static void main(String... args) {
		SpringApplication.run(WebappExampleProcessApplication.class, args);
	}
}