package com.example.demo02.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class Customer{

    @PostMapping()
    public String saveCustomer(){
        System.out.println("save customer");
        return "saved customer";
    }


}
