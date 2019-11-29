package com.example.demo.normal;

/**
 * @author:WANGJING
 * @Date: 2019/11/25 13:54
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//UserManager userManager = new UserManagerImpl();
		UserManager userManager = new UserManagerImplProxy(new UserManagerImpl());
		userManager.addUser("0001", "张三");
	}

}