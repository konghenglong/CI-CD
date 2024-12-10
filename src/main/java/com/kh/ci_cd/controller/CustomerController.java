package com.kh.ci_cd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping()
    public ResponseEntity<?> getCustomers() {
        return ResponseEntity.ok("Customer controller!");
    }

}
