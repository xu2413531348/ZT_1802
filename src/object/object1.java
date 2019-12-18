package object;
class Animal
{
	void shout() {
	System.out.println("动物叫！");
	}
	@Override
	public String toString(){
		return"这是一只动物";
	}
}
public class object1 {
	public static void main(String[] args) {
		Animal object=new Animal();
		Animal appy=new Animal();
		System.out.println(object.toString());
		System.out.println(appy.toString());
		

	}

}
