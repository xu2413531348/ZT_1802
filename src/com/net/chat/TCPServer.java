package com.net.chat;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		//创建服务器套接字
		ServerSocket fwqtjz=new ServerSocket(8899);
		//监听8899端口
		while(true) {
			Socket khdtjz=fwqtjz.accept();
			//通过客户端套接字获取客户端的IP地址
			new Thread(()->{
				try {
			String ip=khdtjz.getInetAddress().getHostAddress();
			//通过客户端套接字获取客户端的端口号
			int port=khdtjz.getPort();
			System.out.println("和客户端ip地址是"+ip+",端口是"+port+"连接上了");
			//String xinxi="客户端你好，来自服务的问候";
			InputStream is;
				is=khdtjz.getInputStream();
				byte[] zjhc=new byte[1024];
			FileOutputStream fout=new FileOutputStream ("d:\\upload\\"+ip+"jpg");
			int b=is.read(zjhc);
			while(b!=-1) {
				fout.write(zjhc,0,b);
				b=is.read(zjhc);
			}
			String xinxi="文件上传成功";
			zjhc=new byte[1024];
			OutputStream os=khdtjz.getOutputStream();
			os.write(xinxi.getBytes("UTF-8"));
			os.close();
			khdtjz.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
			
			}).start();
		}
	}
}
