package com.hand.route;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.QueueingConsumer;

/**
 * @author:WANGJING
 * @Date: 2019/11/4 13:49
 *
 *
 */

public class Recv1{
	private final static String EXCHANGE_NAME = "1104_exchange_direct";

	private final static String QUEUE_NAME = "1104_test_queue_direct_1";

	public static void main(String[] argv) throws Exception {

		// 获取到连接以及mq通道
		Connection connection = ConnectionUtil.getConnection();
		Channel channel = connection.createChannel();

		// 声明队列
		channel.queueDeclare(QUEUE_NAME, false, false, false, null);
		//绑定队列到交换机
		channel.queueBind(QUEUE_NAME,EXCHANGE_NAME,"delete");
		channel.queueBind(QUEUE_NAME,EXCHANGE_NAME,"update");
		channel.queueBind(QUEUE_NAME,EXCHANGE_NAME,"insert");

		// 同一时刻服务器只会发一条消息给消费者
		channel.basicQos(1);

		// 定义队列的消费者
		QueueingConsumer consumer = new QueueingConsumer(channel);
		// 监听队列，false表示手动返回完成状态，true表示自动
		//channel.basicConsume(QUEUE_NAME, true, consumer);
		channel.basicConsume(QUEUE_NAME, false, consumer);

		// 获取消息
		while (true) {
		QueueingConsumer.Delivery delivery = consumer.nextDelivery();
		String message = new String(delivery.getBody());
		System.out.println(" [y] Received '" + message + "'");
		//休眠
		Thread.sleep(10);
		// 返回确认状态，注释掉表示使用自动确认模式
		channel.basicAck(delivery.getEnvelope().getDeliveryTag(), false);

		}
	}
}
