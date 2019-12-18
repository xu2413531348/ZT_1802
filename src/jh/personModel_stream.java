package jh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class personModel_stream {

	public static void main(String[] args) {
		List<persoModel> list=new ArrayList<>();
		persoModel p1=new persoModel("wang Yu",18,"男");
		persoModel p2=new persoModel("zhang san",20,"男");
		persoModel p3=new persoModel("li si",22,"女");
		persoModel p4=new persoModel("zhao qiao",28,"男");
		Arrays.asList(p1,p2,p3,p4);
		
		
		for(persoModel pm:list) {
			System.out.println(pm.getName());
		}
		
		List<String>list2=list.stream().map(a->a.getName()).collect(Collectors.toList());
		System.out.println(list2);
		
		

	}

}
