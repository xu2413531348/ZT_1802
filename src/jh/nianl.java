package jh;
import java.util.TreeSet;
class Teacher implements Comparable<Object>{
String name;
int age;
	public Teacher(String name,int age) {
		super();
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return  name + ":" + age ;
	}
	@Override
	public int compareTo(Object obj) {
		Teacher t=(Teacher)obj;
		return t.age-this.age;
	}
	
	
}
public class nianl {

	public static void main(String[] args) {
		TreeSet<Object> tS=new TreeSet<>();
		tS.add(new Teacher("jack",19));
		tS.add(new Teacher("Rose",22));
		tS.add(new Teacher("Tom",18));
		tS.add(new Teacher("Rose",25));
		System.out.println(tS);

	}

}
