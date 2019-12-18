package com.static1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Thread_test16 {
	//创建第一个线程，从1加到10
	public static void main(String[] args) throws Exception, ExecutionException {
		CompletableFuture<Integer> cf1=CompletableFuture.supplyAsync(()->{
			int sum=0;
			for(int i=1;i<21;i++) {
				sum+=1;
				System.out.println(Thread.currentThread().getName()+"线程正在执行i:"+i);
			}
			return sum;	
			
		});
		//创建第二个线程，从1加到10
		CompletableFuture<Integer> cf2=CompletableFuture.supplyAsync(()->{
			int sum=0;
			for(int j=1;j<21;j++) {
				sum+=j;
				System.out.println(Thread.currentThread().getName()+"线程正在执行j:"+j);
			}
			return sum;	
			
		});
	//int total=cf1.get()+cf2.get();
		CompletableFuture<Integer> cf3=cf1.thenCombine(cf2, (r1,r2)->r1+r2);
	System.out.println("两个线程求和结果是:"+cf3.get());

	}
}
