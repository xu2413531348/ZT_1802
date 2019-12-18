package com.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filereader {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("d:\\poem.txt");
		FileWriter fw=new FileWriter("poem1.txt");
		
		char []buff=new char[2048];
		int b=fr.read(buff);
		while (b!=-1) {
			fw.write(buff,0,b);
			b=fr.read(buff);
			
			
		}
		fr.close();
		fw.close();
	}

}
