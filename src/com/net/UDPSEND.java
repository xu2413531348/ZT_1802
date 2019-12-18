package com.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSEND {

	public static void main(String[] args) throws Exception {
		//创建套接字
	DatagramSocket ds=new DatagramSocket(8900);
	byte[] buf=new byte[1024];
	DatagramPacket dp=new DatagramPacket(buf,buf.length);
	System.out.print("等待接收数据.....");
		//通过套接字发送数据
	while(true) {
		ds.receive(dp);
		String xinxi=new String(dp.getData(),0,dp.getLength());
		System.out.print(xinxi);
	}


	}

}
