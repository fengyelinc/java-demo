package com.hand.publish;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @author:WANGJING
 * @Date: 2019/11/4 13:39
 */
public class ConnectionUtil {

		public static Connection getConnection() throws Exception {
			//定义连接工厂
			ConnectionFactory factory = new ConnectionFactory();
			//设置服务地址
			factory.setHost("localhost");
			//端口
			factory.setPort(5672);
			//设置账号信息，用户名、密码、vhost
			factory.setVirtualHost("1104test");
			factory.setUsername("admin");
			factory.setPassword("guest");
			// 通过工程获取连接
			Connection connection = factory.newConnection();
			return connection;
		}
}
