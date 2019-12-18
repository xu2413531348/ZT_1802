package com.api;

public class E02 {

	public static void main(String[] args) {
		String s1="abcabccbanba.jpg";
		System.out.println("字符串s1的长度是"+s1.length());
		System.out.println("字符串s1的第一个字符是"+s1.charAt(0));
		System.out.println("字符串s1的第二个字符是"+s1.charAt(1));
		System.out.println("字符串s1中字符c第一次出现的位置是"+s1.indexOf('c'));
		System.out.println("字符串s1中字符c最后一次出现的位置是"+s1.lastIndexOf(99));
	}

}
