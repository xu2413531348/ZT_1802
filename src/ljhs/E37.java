package ljhs;
class Person{
	@Override
	public void finalize() {
		System.out.println("对象将被垃圾回收.....");
	}
}
public class E37 {
	public static void recyclegwaste1() {
	Person p1=new Person();
	p1=null;
	for (int i = 0; i < 10; i++) {
		System.out.println("方法一循环中.....");
		
	}
}
	
	public static void recyclegwaste2() {
	Person p2=new Person();
	p2=null;
	System.gc();
	for (int i1 = 0; i1 < 10; i1++) {
		System.out.println("方法2循环中.....");
		
	}	
}
	
	
	public static void main(String[] args) {
		recyclegwaste1();
		System.out.println("----------");
		recyclegwaste2();
	}
}
