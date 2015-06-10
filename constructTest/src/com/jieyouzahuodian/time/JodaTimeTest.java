package com.jieyouzahuodian.time;

import org.joda.time.DateTime;

/**
 * 用joda来研究时间的问题
 * @author liubei
 *
 */
public class JodaTimeTest {

	public static void main(String[] args) {
		DateTime dt = new DateTime(2014,2,6,11,19,0,0);
		System.out.println(dt.toString("yyyy年MM月dd日 HH时mm分"));
	}
}
