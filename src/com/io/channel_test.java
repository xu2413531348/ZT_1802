package com.io;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class channel_test {

	public static void main(String[] args) throws Exception {
		RandomAccessFile ywj=new RandomAccessFile("d:\\360Downloads.rar","rw");
		//
		FileChannel yfc=ywj.getChannel();
		//
		RandomAccessFile mbwj=new RandomAccessFile("d:\\360Downloads2.rar","rw");
		//
		FileChannel mbfc=mbwj.getChannel();
		//
		long cg=yfc.transferTo(0,yfc.size(),mbfc);
		if(cg>0) {
			System.out.println("复制成功");
		}
		ywj.close();
		yfc.close();
		mbwj.close();
		mbfc.close();
	}

}
