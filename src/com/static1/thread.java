package com.static1;
class mythread1 extends Thread{

	public mythread1(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}
	public void run() {
		int i=0;
		while(i++<5) {
		System.out.println(Thread.currentThread().getName()+"的run()方法正在运行");
	}
}
}
public class thread {

	public static void main(String[] args) {
		mythread1 t1=new mythread1("线程1");
		t1.start();
		new mythread1("线程2").start();
	}

}
