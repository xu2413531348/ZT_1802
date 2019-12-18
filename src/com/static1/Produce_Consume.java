package com.static1;

import java.util.ArrayList;
import java.util.List;

public class Produce_Consume {

	public static void main(String[] args) {
		List<Object>goods=new ArrayList<>();
		long start=System.currentTimeMillis();
		Thread thread1=new Thread(()->{
			int num=0;
			while(System.currentTimeMillis()-start<=100) {
				synchronized(goods) {
					if(goods.size()>0) {
						try {
							goods.wait();
						}catch(InterruptedException e){
							e.printStackTrace();
						}
					}else {
						goods.add("商品"+(++num));
			System.out.println("生产商品"+num);
					}
				}	
		}
			
		},"生产者"); 
		//创建一个消费线程，用于消费商品从集合中删除
		Thread thread2=new Thread(()->{
			int lef=0;
			while(System.currentTimeMillis()-start<=100) {
				synchronized(goods) {
					if(goods.size()<=0) {
						goods.notify();
					}else {
						goods.remove("商品"+(++lef));
			System.out.println("消费商品"+lef);
					}
				}	
		}
			
		},"消费者"); 
		//同时启动生产者和消费者两个线程 并同一执行100毫秒时间
	thread1.start();	
	thread2.start();	
	}
}


