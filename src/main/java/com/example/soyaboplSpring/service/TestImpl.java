package com.example.soyaboplSpring.service;

import org.springframework.stereotype.Service;

@Service
public class TestImpl  implements TestInter{

	@Override
	public String getHello() {
		
		return "Hello";
	}
	
	
	

}
