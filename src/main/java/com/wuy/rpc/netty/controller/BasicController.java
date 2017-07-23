package com.wuy.rpc.netty.controller;


import com.wuy.rpc.netty.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

	@Autowired
	private BasicService basicService;

	@RequestMapping("/")
	public String index(){
		return "Hello index";
	}

	@RequestMapping("/saveuser")
	public String saveUser(){
		basicService.SaveUser();
		return "Hello world";
	}


}
