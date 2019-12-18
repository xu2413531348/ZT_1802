package com.static1;
class TicketWindow extends Thread{

	public TicketWindow(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}
	private int rickets=100;
	public void run() {
		while(true) {
			if(rickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在卖第"+rickets--+"张票");
			}
		}
	}
}
public class Thread_test4 {

	public static void main(String[] args) {
		new TicketWindow("窗口一").start();
		new TicketWindow("窗口二").start();
		new TicketWindow("窗口三").start();
		new TicketWindow("窗口四").start();

	}

}
