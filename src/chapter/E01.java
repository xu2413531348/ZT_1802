package chapter;
	class Animal{
		String name;
		//定义动物的叫法
		void shout() {
			System.out.println("动物发出叫声");
		}
	}
	//定义dog类继承Animal类
	class Dog extends Animal{
		//定义狗的叫法
		void shout() {
			System.out.println("汪汪汪汪.....");
		}
		public void printName() {
			System.out.println("name="+name);
		}
		
	}
	//定义测试类
public class E01 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.name="哈士奇";
		dog.printName();
		dog.shout();

	}

}