package com.example.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderservice.feign.UserClient;
import com.example.orderservice.feign.UserDTO;

@Service
public class OrderService {

    @Autowired
    private UserClient userClient;

    public void processOrder(Long userId) {
//        UserDTO user = userClient.getUserById(userId);
//        System.out.println("User info: " + user);
    }
}

