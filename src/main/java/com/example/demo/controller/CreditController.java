package com.example.demo.controller;

import com.example.demo.service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreditController {
    @Autowired
    private AccessService accessService;
}
