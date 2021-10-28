package com.empresadopaulo.hystrix.dashb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashbApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashbApplication.class, args);
	}

}
