package com.synwing.cloud.demo.feign.service;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value="cloud-user")
public interface CloudUserService {
	
	@RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
	@ResponseBody Map<String, String> getUser(@PathVariable("userId") String userId);

}
