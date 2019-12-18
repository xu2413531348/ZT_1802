package com.io;

import java.nio.CharBuffer;

public class charBuffer {

	public static void main(String[] args) {
		CharBuffer cbf= CharBuffer.allocate(6);
		System.out.println("这个字符缓冲区容量是"+cbf.capacity());
		System.out.println("这个字符缓冲区界限值是"+cbf.limit());
		System.out.println("这个字符缓冲区初始位置值是"+cbf.position());
		//添加3个元素
		cbf.put('a');cbf.put('b');cbf.put('c');
		System.out.println("添加三个元素以后这个字符缓冲区容量是"+cbf.capacity());
		System.out.println("添加三个元素以后这个字符缓冲区界限值是"+cbf.limit());
		System.out.println("添加三个元素以后这个字符缓冲区初始位置值是"+cbf.position());
		//执行反转方法
		cbf.flip();
		System.out.println("添加三个元素并反转之后这个字符缓冲区容量是"+cbf.capacity());
		System.out.println("添加三个元素并反转之后这个字符缓冲区界限值是"+cbf.limit());
		System.out.println("添加三个元素并反转之后这个字符缓冲区初始位置值是"+cbf.position());
		//取出第一个元素
		System.out.println("取出第一个元素是:"+cbf.get());
		System.out.println("添加三个元素并反转取出第一个元素之后这个字符缓冲区容量是"+cbf.capacity());
		System.out.println("添加三个元素并反转取出第一个元素之后这个字符缓冲区界限值是"+cbf.limit());
		System.out.println("添加三个元素并反转取出第一个元素之后这个字符缓冲区初始位置值是"+cbf.position());
		//执行clear方法
		System.out.println("执行clear方法之后这个字符缓冲区容量是"+cbf.capacity());
		System.out.println("执行clear方法这个字符缓冲区界限值是"+cbf.limit());
		System.out.println("执行clear方法这个字符缓冲区初始位置值是"+cbf.position());
		//取出第一个元素
		System.out.println("取出第一个元素是:"+cbf.get());
		System.out.println("取出的第一个元素为"+cbf.capacity());
		System.out.println("取出后的界限值"+cbf.limit());
		System.out.println("取出后的位置"+cbf.position());
		//取出第一个元素
	}

	
	

}
