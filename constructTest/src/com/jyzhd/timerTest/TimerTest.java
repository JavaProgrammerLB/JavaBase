package com.jyzhd.timerTest;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * java ��ʱ������о�
 * @author liubei
 *
 */
public class TimerTest {
	public static void main(String[] args) {
		Timer timer = new Timer();		
		/*�½�TimeTask����
		 * �������Ĺ��췽����ô��̫һ��--����һ��run()����
		 * TimeTask��һ�������࣬ʵ��Runnable�ӿ�
		 */
		TimerTask task  = new TimerTask() {
			@Override
			public void run() {
				System.out.println("ִ��ʱ��"+new Date());
				System.out.println("������2015��1��29�գ�23ʱ20��");
			}
		};
		
		/*
		 * --���ʵ��һ���Ӻ�Ĺ���
		 * */
//		Date date = new Date();
//		Date time = new Date();
		System.out.println("����ʱ��"+new Date());
		timer.schedule(task,1*60*1000);
	}

}
