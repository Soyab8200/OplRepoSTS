package com.example.soyaboplSpring.service;

import org.springframework.stereotype.Service;

@Service
public class TestImpl  implements TestInter{

	@Override
	public String getHello() {
		
		return "Hello";
	}

	@Override
	public int getInt() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public double getd() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	

}
