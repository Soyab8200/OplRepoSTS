package com.example.soyaboplSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.soyaboplSpring.service.TestInter;

@RestController
public class TestCon {
	
	@Autowired
	private TestInter testInter;
	
	
	public String getAll()
	{
		String hello = testInter.getHello();
		return hello;
	}

}
