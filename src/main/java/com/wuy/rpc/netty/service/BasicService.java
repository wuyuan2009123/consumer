package com.wuy.rpc.netty.service;

import com.wuy.rpc.api.mcm.UserRemote;
import com.wuy.rpc.api.pojo.User;
import com.wuy.rpc.client.annotation.RemoteInvoker;
import org.springframework.stereotype.Service;

@Service
public class BasicService {
	
	@RemoteInvoker
	private UserRemote userRemote;
	
	public void SaveUser(){
		User u = new User();
		u.setId(1L);
		u.setName("张三");
		Object save = userRemote.save(u);
		System.out.println(save);
	}
	
	
	
}
