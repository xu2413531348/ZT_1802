package interface_;

interface Animal{
	int ID=1;
	void breathe();
default void getType(String type) {
	System.out.println("该动物属于:"+type);
}
static int getID() {
	return Animal.ID;
}
}
interface landAnimal extends Animal{
	void run();
}
class Dog1 implements landAnimal{

	@Override
	public void breathe() {
		System.out.println("狗在呼吸");
		
	}

	@Override
	public void run() {
		System.out.println("小狗在跑");
		
	}
	
}
public class E14 {

	public static void main(String[] args) {
		 {
			 System.out.println(Animal.getID());
			 Dog1 dog=new Dog1();
			 System.out.println(dog.ID);
			 dog.breathe();
			 dog.getType("犬科");
			 dog.run();
			
		}

	}

}
