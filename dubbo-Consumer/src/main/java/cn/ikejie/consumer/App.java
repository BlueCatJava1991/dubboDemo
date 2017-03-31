package cn.ikejie.consumer;

import java.io.IOException;


/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args){
		int i=0;
		while(i<100){
			ConsumerThd thd=new ConsumerThd();
			thd.sayHello();
			i++;
		}
	
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
