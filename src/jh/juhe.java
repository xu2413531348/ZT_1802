package jh;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class juhe {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>(); 
		list.add("张三"); 
		list.add("李四"); 
		list.add("黄小明"); 
		list.add("刘洋"); 
		list.add("黄一一"); 
		list.add("黄易"); 
		//把集合变成流
		Stream<String> liu=list.stream();
		liu.forEach(j->System.out.println(j));
		//过滤
		Stream<String> liu2=list.stream();
		Stream<String> liu3=liu2.filter(k->k.startsWith("张"));
		System.out.println("集合里所有的人:");
		liu3.forEach(j->System.out.println(j));
		
		System.out.println("集合里第二个和第三个姓黄的人:");
		list.stream().filter(k->k.startsWith("黄")).skip(1).limit(2).forEach(j->System.out.println(j));
		
		System.out.println("集合里第二个和第三个姓黄的人用,连接:");
		System.out.println(list.stream().filter(k->k.startsWith("黄")).skip(1).limit(2).collect(Collectors.joining(",")));
	}

}
