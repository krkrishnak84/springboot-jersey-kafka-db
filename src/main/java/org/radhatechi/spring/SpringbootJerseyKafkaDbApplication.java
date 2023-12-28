package org.radhatechi.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringbootJerseyKafkaDbApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringbootJerseyKafkaDbApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(SpringbootJerseyKafkaDbApplication.class, args);

		logger.debug("Debug log message");
		logger.info("Info log message");
		logger.error("Error log message");
		logger.warn("Warn log message");
		logger.trace("Trace log message");

	}

}
