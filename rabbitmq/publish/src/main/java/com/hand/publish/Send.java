package com.hand.publish;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * @author:WANGJING
 * @Date: 2019/11/4 13:48
 */
public class Send {
	private final static String EXCHANGE_NAME = "1104_test_exchange_fanout";

	public static void main(String[] argv) throws Exception {
		// 获取到连接以及mq通道
		Connection connection = ConnectionUtil.getConnection();
		Channel channel = connection.createChannel();

		// 声明exchange
		channel.exchangeDeclare(EXCHANGE_NAME, "fanout");


		for (int i = 10; i < 20; i++) {
			// 消息内容
			String message = "Hello World! publish"+i;
			channel.basicPublish(EXCHANGE_NAME, "", null, message.getBytes());
			System.out.println(" [x] Sent '" + message + "'");
			Thread.sleep(300);
		}
		channel.close();
		connection.close();
	}
}
