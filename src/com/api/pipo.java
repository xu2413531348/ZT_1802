package com.api;

public class pipo {

	public static void main(String[] args) {
		long kssj=System.currentTimeMillis();
		int sum=0;
		for (int i = 0; i < 100000000; i++) {
			sum+=i;
			
		}
		long jssj=System.currentTimeMillis();
		System.out.println("从0加到1亿耗时"+(jssj-kssj)+"毫秒");

	}

}
