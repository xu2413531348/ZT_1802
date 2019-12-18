package com.net.chat;

import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSender implements Runnable {
	private DatagramSocket ds;
	private int i;
	public ChatSender(DatagramSocket ds, int i) {
		this.ds=ds;
		this.i=i;
	}

	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		while(true) {
		try {
		System.out.println("我说:");
		//将数据转换为二进制字节数组
		String str=sc.nextLine();
		byte[] zjsz;
		zjsz = str.getBytes("UTF-8");
		System.out.println("这条信息要发送给那个IP:");
		String IP=sc.nextLine();
		//创建要发送的数据报
		DatagramPacket dp=new DatagramPacket(zjsz,zjsz.length,InetAddress.getByName(IP),8900);
		//发送前给提示
		//System.out.print("开始发送信息.....");
		//通过套接字发送数据
		ds.send(dp);
	} catch (Exception e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
		
	}
	}
}


