package com.hand.mqsend;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * @author:WANGJING
 * @Date: 2019/11/4 13:48
 */
public class Send {

	private final static String QUEUE_NAME = "1104_test_01";

	public static void main(String[] argv) throws Exception {
		// 获取到连接以及mq通道
		Connection connection = ConnectionUtil.getConnection();
		// 从连接中创建通道
		Channel channel = connection.createChannel();

		// 声明（创建）队列
		channel.queueDeclare(QUEUE_NAME, false, false, false, null);

		// 消息内容
		String message = "Hello World3!";
		channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
		System.out.println(" [x] Sent111 '" + message + "'");
		//关闭通道和连接
		channel.close();
		connection.close();
	}
}
