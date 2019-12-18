package jh;

import java.util.HashSet;

public class E1 {
	String name;
	int age;
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		E1 other = (E1) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public E1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

	

	public static void main(String[] args) {
		E1 p1=new E1("Tom",25);
		E1 p2=new E1("rome",21);
		E1 p3=new E1("appy",15);
		E1 p4=new E1("Tom",25);
		HashSet<E1> h1=new HashSet<E1>();
		h1.add(p1);
		h1.add(p2);
		h1.add(p3);
		h1.add(p4);
		System.out.println(h1);
		
		

	}
	@Override
	public String toString() {
		return  name + ":" + age ;
	}

}
