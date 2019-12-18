package com.static1;
class TicketWindow4 implements Runnable{
	private int rickets=10;
	public void run() {
		while(true) {
			maipiap();
		}
	}
private synchronized void maipiap() {
		if(rickets>0) {
			try {
				Thread.sleep(100);
			}catch(InterruptedException e){
				// TODO 自动生成的catch块
				e.printStackTrace();
			}
		}
			if(rickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在卖第"+rickets--+"张票");
			}
		}
	}
public class Thread_test12 {

	public static void main(String[] args) {
	TicketWindow4 tw=new TicketWindow4();
	new Thread(tw,"窗口1").start();
	new Thread(tw,"窗口2").start();
	new Thread(tw,"窗口3").start();
	new Thread(tw,"窗口4").start();

	}
}