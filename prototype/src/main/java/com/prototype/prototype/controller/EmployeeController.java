package com.prototype.prototype.controller;

import com.prototype.prototype.PrototypeApplication;
import com.prototype.prototype.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeService service;
}
