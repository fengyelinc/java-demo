package com.hand.work;

import org.junit.jupiter.api.Test;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.util.DateUtil.now;
import static org.quartz.TriggerBuilder.newTrigger;

@SpringBootTest
class WorkApplicationTests {
@Autowired
private HelloWorldJob helloWorldJob;
	@Test
	void contextLoads() throws SchedulerException {

		//创建调度器
		StdSchedulerFactory stdSchedulerFactory = new StdSchedulerFactory();
		Scheduler scheduler = stdSchedulerFactory.getScheduler();

		//创建JobDetail实例，并与HelloWorld类绑定
		JobDetail jobDetail = JobBuilder.newJob(HelloWorldJob.class)
				.withIdentity("job1", "jobgroup1")
				.build();

		//创建触发器Trigger实例（立即执行，每隔1s执行一次）
		Trigger trigger = (SimpleTrigger) newTrigger()
				.withIdentity("trigger1","triggerGroup1")
				.startNow()
				.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(1).withRepeatCount(10))
				.build();

		//开始执行
		scheduler.scheduleJob(jobDetail,trigger);
		scheduler.start();

	}


	@Test
	void test2(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);
		Object sayHello = context.getBean("SayHello");

	}

}
