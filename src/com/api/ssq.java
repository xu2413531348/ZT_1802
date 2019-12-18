package com.api;

import java.util.HashSet;
import java.util.Random;

public class ssq {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("双色球开奖:");
		System.out.println("六个球开奖:");
		Thread.sleep(1000);
		Random r=new Random();
		HashSet<Integer> hs=new HashSet<>();
		for (int i = 0; i <1000; i++) {
			int hq=r.nextInt(33)+1;
			hs.add(hq);
			if(hs.size()==6) {
				break;
			}
			//System.out.print(hq+" ");
			//Thread.sleep(1000);	
		}
		for(Integer hq:hs) {
			System.out.print(hq+" ");
			Thread.sleep(1000);	
		}
		
		/*System.out.print("篮球号码是:");
		Random r1=new Random();
		for (int i = 0; i <1; i++) {
			int lq=r1.nextInt(33)+1;
			System.out.print(lq+" ");
			Thread.sleep(1000);*/
			
	}

}
