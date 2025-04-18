package com.example.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderservice.feign.UserClient;
import com.example.orderservice.feign.UserDTO;


@RestController
@RequestMapping("/")
public class OrderController {
	
	@Autowired
	private UserClient userClient;

	@GetMapping("order")
	public String getOrder() {
	    return "Order fetched";
	}
	
	@GetMapping("call-user-service")
	public UserDTO getUsers() {
		return userClient.getUsers();
	}
	
	@GetMapping("getUserById")
	public UserDTO getUserById() {
		return userClient.getUserById(Long.valueOf(1));
	}
}
