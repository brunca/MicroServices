package br.com.getnet.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wagner Brunca
 *
 */
@RestController
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaServer
public class MicroServiceMain {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MicroServiceMain.class, args);
	}
	
	

}
