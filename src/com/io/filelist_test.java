package com.io;

import java.io.File;

public class filelist_test {
	private static void fileDir(File ml) {
		File[] wjsz=ml.listFiles();
		for (File file :wjsz) {
			if(file.isDirectory()) {
				fileDir(file);
			}else if(file.isFile()) {
				if (file.getName().endsWith(".java"))
					System.out.println(file);
			}
		}
	}
	
	public static void main(String[] args) {
		File ml=new File("E:\\大二上学期");
		fileDir(ml);

	}
	

}
