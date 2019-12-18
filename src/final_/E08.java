package final_;
class Animal{
	//如果一个成员变量被final修饰，则该变量在本类中不能再次被赋值
	final String name="动物";
	public  void shout() {}
	@Override
	public String toString() {
		return"这是一只动物";
	}
}
class Dog extends Animal{
	@Override
	public  void shout() {}
	@Override
	public String toString() {
		return"这是一只小狗";
	}
}

public class E08 {

	public static void main(String[] args) {
		Animal dw=new Animal();
		Dog xg=new Dog();
		System.out.println(dw);
		System.out.println(xg);

	}

}
