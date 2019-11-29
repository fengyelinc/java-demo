package com.example.demo.normal;

/**
 * @author:WANGJING
 * @Date: 2019/11/25 13:52
 */

public class UserManagerImplProxy implements UserManager {

	private UserManager userManager;

	public UserManagerImplProxy(UserManager userManager) {
		this.userManager = userManager;

	}

	@Override
	public void addUser(String userId, String userName) {
		try {
			System.out.println("start-->>addUser() userId-->>" + userId);
			userManager.addUser(userId, userName);
			System.out.println("success-->>addUser()");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("error-->>addUser()");
		}
	}

	@Override
	public void delUser(String userId) {
	}

	@Override
	public String findUser(String userId) {
		return null;
	}

	@Override
	public void modifyUser(String userId, String userName) {

	}

}