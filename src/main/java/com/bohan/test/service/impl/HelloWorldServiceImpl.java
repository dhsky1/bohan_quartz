package com.bohan.test.service.impl;

import org.springframework.stereotype.Service;

import com.bohan.test.service.HelloWorldService;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String getNewName(String userName) {
		return "hello spring!"+userName;
	}
}
