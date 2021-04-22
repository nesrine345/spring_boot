package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.UEntity;

@RestController

public class Controller {
	
 @RequestMapping(value="/user", method=RequestMethod.GET)
 public UEntity affUser() {
	 UEntity U=new UEntity(12869212,"nesrine","123","n@gmail.com","sousse");
	 return U;
 }
}
