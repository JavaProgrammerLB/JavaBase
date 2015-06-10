package com.jieyouzahuodian.String;

public class StringReverser implements Reverser{

	public static void main(String[] args) {
		StringReverser strRev = new StringReverser();
		String s = strRev.reverse("5oi");
		System.out.println(s);
	}

	@Override
	public String reverse(String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}
		return new StringBuffer(str).reverse().toString();
	}

}
