package com.yichang;

public class E28 {
	public static int divide(int x,int y) {
		int result=x/y;
		return result;
	}
	public static void main(String[] args) {
		try {
			int result=divide(4,0);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("捕获的异常信息为:"+e.getMessage());
		}


	}

}
