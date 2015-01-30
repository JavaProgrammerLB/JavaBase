package com.jieyouzahuodian;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

	/**
	 * ѧϰʹ��Date��
	 * ѧ���ʾ����2015��1��31��8:00ʱ
	 * ѧ���ʾһ���
	 * ���ڸ�ʽ���ķ�ʽ
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
