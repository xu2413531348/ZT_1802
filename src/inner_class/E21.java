package inner_class;

import java.nio.channels.ShutdownChannelGroupException;

@FunctionalInterface
interface Animal{
	void shout();
}
@FunctionalInterface
interface Calculate{
	int sum(int a,int b);
}
class Cat implements Animal{

	@Override
	public void shout() {
		System.out.println("喵喵");
	}

	
}
public class E21 {

	public static void main(String[] args) {
		//第一种表达式
		Cat cat=new Cat();
		cat.shout();
		//第二种表达式，用匿名内部类的方法
		animalshout(new Animal() {
			
			@Override
			public void shout() {
				System.out.println("wangwang");
				
			}
		});
		//第三种方式，用lambda表达式调用shout方法
		animalshout(()->System.out.println("waowao...."));
		//animalshout(()->{System.out.println("waowao...."));
		//System.out.println("I am is tiger");});
		showSum(10,20,(x,y)->x+y);
	}
	
	private static void showSum(int i, int j, Calculate c) {
		System.out.println(i+"+"+j+"的和是"+c.sum(i,j));
		
	}

	private static void animalshout(Animal animal) {
		animal.shout();
		
	}

}
