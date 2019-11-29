package com.hand.route;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

/**
 * @author:WANGJING
 * @Date: 2019/11/4 13:48
 */
public class Send {
	private final static String EXCHANGE_NAME = "1104_exchange_direct";

	public static void main(String[] argv) throws Exception {
		// 获取到连接以及mq通道
		Connection connection = ConnectionUtil.getConnection();
		Channel channel = connection.createChannel();

		// 声明队列
		channel.exchangeDeclare(EXCHANGE_NAME,"direct" );

		for (int i = 500; i <510; i++) {
			// 消息内容
			String message = "删除商品" + i;
			channel.basicPublish(EXCHANGE_NAME, "insert",null, message.getBytes());
			System.out.println(" [x] Sent '" + message + "'");

			Thread.sleep(100);
		}

		channel.close();
		connection.close();
	}
}
