package com.net.chat;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPCLient {

	public static void main(String[] args) throws Exception, IOException {
		//创建客户端套接字要带上服务器的IP地址
		Socket khdtjz=new Socket("10.2.103.31",8899);
		//通过客户端套接字获取写入网络的输出流
		OutputStream os=khdtjz.getOutputStream();
		//定义要上传的文件输入流
		FileInputStream fin=new FileInputStream("d:\\1.jpg");
		//InputStream is=khdtjz.getInputStream();
		
		//通过文件输入流读取文件，并写入网络
		byte[]zjhc=new byte[1024];
		int b=fin.read(zjhc);
		while(b!=-1) {
		//System.out.print(new String(zjhc,0,b));
			os.write(zjhc,0,b);
			b=fin.read(zjhc);
		}
		//fin.close();
		//khdtjz.close();
		khdtjz.shutdownOutput();
		InputStream is=khdtjz.getInputStream();
		b=is.read(zjhc);
		while(b!=-1) {
			System.out.println(new String(zjhc,0,b));
			b=is.read(zjhc);
		}
		is.close();
		khdtjz.close();
	}
}
