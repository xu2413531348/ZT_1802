package com.static1;
class mythread2 extends Thread{
	public void run() {
		int i=0;
		while(i++<5) {
		System.out.println(Thread.currentThread().getName()+"的run()方法正在运行");
	}
}
}
public class Thread_test2 {

	public static void main(String[] args) {
		mythread2 mt1=new mythread2();
		Thread t1=new Thread(mt1,"线程1");
		mt1.start();
		mythread2 mt2=new mythread2();
		new Thread(mt2,"线程2").start();
		new Thread(new mythread2(),"线程3").start();
	}

}
