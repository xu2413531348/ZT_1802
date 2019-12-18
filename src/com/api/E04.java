package com.api;

public class E04 {

	public static void main(String[] args) {
		String s1="ab5ca我bc7cb8爱anb7a5dh5祖5国td85td.jpg";
		System.out.println("这个字符里的数字是: ");
		//将字符串打碎成字符数组
		char[] zfsz=s1.toCharArray();
		//foreach循环：对于字符数组里的每个字符
		//冒号前面是集合或者数组里的单个元素，冒号后面是集合或者是数组
		for(char zf:zfsz) {
			if(zf>='0'&&zf<='9'){
			//0-9是数组a-z是字母
			System.out.print(zf);	
			}
		}
		System.out.println("\n这个字符串里的汉字是: ");
		//将字符串打碎成字符数组
		//foreach循环：对于字符数组里的每个字符
		//冒号前面是集合或者数组里的单个元素，冒号后面是集合或者是数组
		for(char zf:zfsz) {
			if(zf>='\u4E00'&&zf<='\u9FA5') {
			System.out.print(zf);	
			}
	}
	
	}
}
