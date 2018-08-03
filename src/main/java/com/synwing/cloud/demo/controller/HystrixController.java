package com.synwing.cloud.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.synwing.cloud.demo.feign.service.CloudUserService;
import com.synwing.cloud.demo.hystrix.service.UserService;

@RestController
@RequestMapping(value="/cloud")
public class HystrixController {

	@Autowired
	private UserService userService;

	@Autowired
	private CloudUserService cloudUserService;
	
	@RequestMapping(value= "/hystrix")
	public String testHystrix() {
		System.out.println(cloudUserService.getUser("123"));
		return userService.getUser("123");
	} 
	
}
