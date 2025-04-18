package com.example.orderservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service") // this name should match the service registered in Eureka
public interface UserClient {

    @GetMapping("/users/list")
    UserDTO getUsers();
    
    @GetMapping("/users/{id}")
    UserDTO getUserById(@PathVariable("id") Long id);
}

