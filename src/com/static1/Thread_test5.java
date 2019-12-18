package com.static1;
class TicketWindow2 implements Runnable{

	private int rickets=100;
	public void run() {
		while(true) {
			if(rickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在卖第"+rickets--+"张票");
			}else {break;}
		}
	}
}

public class Thread_test5 {

	public static void main(String[] args) {
	TicketWindow2 tw=new TicketWindow2();
	new Thread(tw,"窗口一").start();
	new Thread(tw,"窗口二").start();
	new Thread(tw,"窗口三").start();
	new Thread(tw,"窗口四").start();

	}

}
