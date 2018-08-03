package com.synwing.cloud.demo.hystrix.service;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class UserServiceImpl implements UserService {

	/* (非 Javadoc)
	* 
	* 
	* @param userId
	* @return
	* @see com.synwing.cloud.demo.hystrix.service.UserService#getUser(java.lang.String)
	*/
	@HystrixCommand(fallbackMethod="fallback")
	public String getUser(String userId) {
		System.out.println("Get user is run...");
		throw new RuntimeException("Get user exception!");
	}
	
	public String fallback(String str) {
		System.out.println(str);
		return "fallback";
	}
	

}
