package com.static1;
class TicketWindow3 implements Runnable{

	private int rickets=10;
	Object lock=new Object();
	public void run() {
		while(true) {
			//同步代码块
			synchronized(lock) {
				if(rickets>0) {
					try {
						Thread.sleep(100);
					}catch(InterruptedException e){
						// TODO 自动生成的catch块
						e.printStackTrace();
					}
				}
			}
			if(rickets>0) {
				System.out.println(Thread.currentThread().getName()+"正在卖第"+rickets--+"张票");
			}else {
				break;
			}
		}	
}
}
public class Thread_test11 {

	public static void main(String[] args) {
	TicketWindow3 tw=new TicketWindow3();
	new Thread(tw,"窗口1").start();
	new Thread(tw,"窗口2").start();
	new Thread(tw,"窗口3").start();
	new Thread(tw,"窗口4").start();

	}

}