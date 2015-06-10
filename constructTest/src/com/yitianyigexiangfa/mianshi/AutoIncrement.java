package com.yitianyigexiangfa.mianshi;

public class AutoIncrement {

	public static void main(String[] args) {
			int j = 0;
			//运算和赋值
			/*
			 * j++:j=1 j++=0
			 * ++j:j=2 ++j=2
			 * j++:j=3 ++j=2
			 *0+2+2+3=7
			 */
			System.err.println(j++ + ++j + j++ + j);
			System.err.println(j);
	}
}
