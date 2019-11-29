package com.hand.topic;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * @author:WANGJING
 * @Date: 2019/11/4 13:48
 */
public class Send {
	private final static String EXCHANGE_NAME = "test_exchange_topic";

	public static void main(String[] argv) throws Exception {
		// 获取到连接以及mq通道
		Connection connection = ConnectionUtil.getConnection();
		Channel channel = connection.createChannel();

		// 声明exchange
		channel.exchangeDeclare(EXCHANGE_NAME, "topic");
		for (int i = 0; i < 10; i++) {
			// 消息内容
			String message = "Hello World!!   topic"+i;
			channel.basicPublish(EXCHANGE_NAME, "routekey.1", null, message.getBytes());
			System.out.println(" [x] Sent '" + message + "'");
			Thread.sleep(500);
		}
		channel.close();
		connection.close();
	}
}
