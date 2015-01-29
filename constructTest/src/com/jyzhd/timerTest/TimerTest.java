package com.jyzhd.timerTest;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * java 定时器类的研究
 * @author liubei
 *
 */
public class TimerTest {
	public static void main(String[] args) {
		Timer timer = new Timer();		
		/*新建TimeTask对象
		 * 这个对象的构造方法怎么不太一样--还有一个run()方法
		 * TimeTask是一个抽象类，实现Runnable接口
		 */
		TimerTask task  = new TimerTask() {
			@Override
			public void run() {
				System.out.println("执行时间"+new Date());
				System.out.println("现在是2015年1月29日，23时20分");
			}
		};
		
		/*
		 * 如何实现一分钟后的功能
		 * */
		Date date = new Date();
		Date time = new Date();
		System.out.println("现在时间"+new Date());
		timer.schedule(task,1*60*1000);
	}

}
