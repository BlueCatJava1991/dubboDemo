package cn.ikejie.api.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"applicationProvider.xml"});
		System.out.println("服务提供方启动");
		context.start();
		System.out.println("按任意键退出");
		System.in.read();
	}
}
