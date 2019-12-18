package inner_class;
//定义一个函数接口
@FunctionalInterface
interface Printable{
	void print(String str);
}
class StringUtis{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class EE25 {
	private static void printUpper(String text,Printable pt) {
		pt.print(text);
	}
	public static void main(String[] args) {
		StringUtis stu=new StringUtis();
		printUpper("hello",t->stu.printUpperCase(t));
		printUpper("hello",stu::printUpperCase);
	}

}
