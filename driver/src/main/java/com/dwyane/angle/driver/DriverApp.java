package com.dwyane.angle.driver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DriverApp {
		public static void main(String[] args) {
				SpringApplication.run(DriverApp.class, args);
		}
}
