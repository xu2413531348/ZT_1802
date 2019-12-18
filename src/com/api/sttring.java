package com.api;

public class sttring {

	public static void main(String[] args) {
		String s="我爱你中国";
		StringBuffer zfchc=new StringBuffer(s);
		System.out.println(zfchc);
		zfchc.append("!");
		System.out.println(zfchc);
		zfchc.insert(3,',');
		zfchc.delete(2, 4);
		//删除
		System.out.println(zfchc);
		System.out.println(zfchc);
		//修改
		zfchc.replace(2,4,"长滩");
		System.out.println(zfchc);
		//反转
		zfchc.reverse();
		System.out.println(zfchc);
	}

}
