package com.dwyane.angle.driver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DriverInfoController {
		@GetMapping
		public String find() {
				return "dwyane";
		}
}
