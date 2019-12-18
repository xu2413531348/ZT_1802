package com.static1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TicketWindow5 implements Runnable{
	private int rickets=10;
	Lock lock=new ReentrantLock();
	public void run() {
		while(true) {
			lock.lock();
			if(rickets>0)
			{
				try {
					Thread.sleep(100);
				}catch(InterruptedException e){
					// TODO 自动生成的catch块
					e.printStackTrace();
				}finally {
					lock.unlock();
				}
			
				if(rickets>0) {
					System.out.println(Thread.currentThread().getName()+"正在卖第"+rickets--+"张票");
				}else {
					break;
				}
	}				
}
}
}
public class Thread_test13{

	public static void main(String[] args) {
	TicketWindow5 tw=new TicketWindow5();
	new Thread(tw,"窗口1").start();
	new Thread(tw,"窗口2").start();
	new Thread(tw,"窗口3").start();
	new Thread(tw,"窗口4").start();

	}
}
