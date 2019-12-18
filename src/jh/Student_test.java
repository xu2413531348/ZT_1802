package jh;

public class Student_test {

	public static void main(String[] args) {
		xs S1=new xs();
		S1.setName("mike");
		S1.setScore(600);
		xs s2=new xs("serena",590);
		System.out.println(S1.getName()+"考了"+S1.getScore()+"分");
		System.out.println(s2.getName()+"考了"+s2.getScore()+"分");
		
		kecheng c1=new kecheng();
		c1.setCourse_name("java基础入门");
		c1.setCourse_book("java程序设计");
		System.out.println(c1.getCourse_name()+"这门课程使用的教材是《"+c1.getCourse_book()+"》");
	}

}
