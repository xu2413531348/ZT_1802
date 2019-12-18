package com.api;

import java.io.IOException;

public class runtime_test {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime  rt=Runtime.getRuntime();
		System.out.println("空间处理数的个数是"+rt.availableProcessors()+"个");
		System.out.println("空间内存大小是"+rt.freeMemory()/1024/1024+"MBytes");
		System.out.println("最大内存大小是"+rt.maxMemory()/1024/1024+"MBytes");
		
		
		Process jincheng=rt.exec("mspaint");
		Thread.sleep(3000);
		jincheng.destroy();
		

	}

	

}
