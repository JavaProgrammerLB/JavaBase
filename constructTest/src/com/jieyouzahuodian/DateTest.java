package com.jieyouzahuodian;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

	/**
	 * 学习使用Date类
	 * 学会表示比如2015年1月31日8:00时
	 * 学会表示一天后
	 * 日期格式化的方式
	 * @param args
	 */
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
		try {
			Date d = df.parse("2015-01-31 08:00:00");
			System.out.println(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Date d2 = new Date();
		System.out.println(d2);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(d2);
		calendar.add(calendar.DATE, 1);
		d2 = calendar.getTime();
		System.out.println(d2);
	}
	//Sun Dec 28 08:00:00 CST 2014

}
