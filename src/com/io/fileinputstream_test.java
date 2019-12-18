package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class fileinputstream_test {

	public static void main(String[] args) throws Exception{
	FileInputStream fin=new FileInputStream("d:\\jp.jpg");
	FileOutputStream fout=new FileOutputStream("c:\\jp2.jpg");
	long kssj=System.currentTimeMillis();
	byte[]zjhc=new byte[1024];
	int b=fin.read(zjhc);
	while (b!=-1) {
		//System.out.print((char)b);
		b=fin.read(zjhc,0,b);
		fout.write(zjhc);
		
	}
	long jssj=System.currentTimeMillis();
	System.out.println("拷贝40kB的图片文件耗时"+(jssj-kssj)+"毫秒");
		fin.close();
		//fout.write(",come on !".getBytes());
		fout.close();
	}


}
