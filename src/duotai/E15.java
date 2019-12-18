package duotai;
abstract class Animal{
	abstract void shout();
}
class Dog extends Animal{

	@Override
	void shout() {
		System.out.println("汪汪.....");
		
	}
	
}
class Car extends Animal{

	@Override
	void shout() {
		System.out.println("喵喵.....");
		
	}
	
}


public class E15 {

	public static void main(String[] args) {
		Animal an1=new Car();
		Animal an2=new Dog();
		an1.shout();
		an2.shout();
	}

}
