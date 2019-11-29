package com.example.demo.normal;

/**
 * @author:WANGJING
 * @Date: 2019/11/25 13:49
 */
public class UserManagerImpl implements UserManager {

	@Override
	public void addUser(String userId, String userName) {
		//System.out.println("start-->>addUser() userId-->>" + userId);
		try {
			System.out.println("UserManagerImpl.addUser() userId-->>" + userId);

			//System.out.println("success-->>addUser()");
		}catch(Exception e) {
			e.printStackTrace();
			//System.out.println("error-->>addUser()");
			throw new RuntimeException();
		}
	}

	@Override
	public void delUser(String userId) {
		System.out.println("UserManagerImpl.delUser() userId-->>" + userId);
	}

	@Override
	public String findUser(String userId) {
		System.out.println("UserManagerImpl.findUser() userId-->>" + userId);
		return "张三";
	}

	@Override
	public void modifyUser(String userId, String userName) {
		System.out.println("UserManagerImpl.modifyUser() userId-->>" + userId);
	}

}