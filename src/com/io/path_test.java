package com.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class path_test {

	public static void main(String[] args) {
		Path path=Paths.get("E:\\大二上学期\\java基础入门\\WorkSpace\\1586\\src\\page001");
		System.out.println("这个路径的根路径是:"+path.getRoot());
		System.out.println("这个路径的父路径是:"+path.getParent());
		System.out.println("这个路径的路径名称是:"+path.getNameCount());
for(int i=0;i<path.getNameCount();i++) {
	System.out.println("索引为"+i+"的路径名称是"+path.getName(i));
	
}
	System.out.println("这个路径的URI路径是"+path.toUri());	
	System.out.println("这个路径的决对路径是"+path.toAbsolutePath());	

	}

}
