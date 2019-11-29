package com.example.demo.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BusinessHandler implements InvocationHandler {

	private Object targetObject;

	public Object newProxyInstance(Object targetObject) {
		this.targetObject = targetObject;
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
				targetObject.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {

		for (int i = 0; i < args.length; i++) {
			System.out.println("参数如下："+args[i]);
		}

		Object ret = null;
		try {


			System.out.println("======================调用前的操作============>>");
			//调用目标方法
			ret = method.invoke(targetObject, args);

			System.out.println("======================调用后成功的操作============>>");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("======================调用失败的操作============>>"+method.getName());
			throw e;
		}
		return ret;
	}

}