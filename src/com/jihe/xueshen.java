package com.jihe;

import java.util.HashSet;

import javax.swing.text.StyledDocument;

class Student{
	String id;
	String name;
	public Student(String id,String name) {
	this.id=id;
	this.name=name;
}

	
@Override
public int hashCode() {
	return id.hashCode();
}
@Override
public boolean equals(Object obj) {
	Student other =(Student) obj;
	return id.equals(other.id);
}
@Override
public String toString() {
	return id+":"+ name;
}


}
public class xueshen {
	
	public static void main(String[] args) {
		HashSet hSet=new HashSet();
		Student stu1=new Student("1", "jack");
		Student stu2=new Student("3", "Rose");
		Student stu3=new Student("3", "Rose");
		hSet.add(stu1);
		hSet.add(stu2);
		hSet.add(stu3);
		System.out.println(hSet);
		
	}
}


