package com.example.demo.reflect;

public class UserManagerImpl implements UserManager {

	@Override
	public String test(String userId) {
		System.out.println("UserManagerImpl.findUser() userId-->>" + userId);
		return "张三";
	}


	@Override
	public String test2(String userId) {
		System.out.println("方法UserManagerImpl.findUser() 被调用  userId-->>" + userId);
		return "李四";
	}


}