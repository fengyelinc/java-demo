package com.hand.work;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * @author:WANGJING
 * @Date: 2019/11/4 13:48
 */
public class Send {
	private final static String QUEUE_NAME = "1104_test_queue_work";

	public static void main(String[] argv) throws Exception {
		// 获取到连接以及mq通道
		Connection connection = ConnectionUtil.getConnection();
		Channel channel = connection.createChannel();

		// 声明队列
		channel.queueDeclare(QUEUE_NAME, false, false, false, null);

		for (int i = 10; i < 20; i++) {
			// 消息内容
			String message = "workB :" + i;
			channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
			System.out.println(" [x] Sent '" + message + "'");

			Thread.sleep(500);
		}

		channel.close();
		connection.close();
	}
}
