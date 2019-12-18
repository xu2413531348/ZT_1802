package inner_class;

import javax.print.attribute.standard.PrinterName;

@FunctionalInterface
interface personBuilder{
	person buildperson(String name);
}
class person{
	private String name;

	public person(String name) {
		this.name = name;}

	public person() {}

	public String getName() {
		return name;
	}
	
}
public class E26 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		PrinterName("刘德华",name->new person(name));
		PrinterName("张学友",person::new);
	}

	private static void PrinterName(String name,personBuilder pb) {
		System.out.println(pb.buildperson(name).getName());
		
	}

}
