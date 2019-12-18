package page001;

public class chongzai {
	//方法重载：同一个类里面有若干个方法的名字相同
	//返回值类型可能不同 参数个数可能不同 参数类型可能不同
	//第一个加法：两个整数相加
	public static int add(int x,int y) {
		return x+y;
	}
	//第二个加法：三个整数相加
	public static int add(int x,int y,int z) {
		return x+y+z;
	}
	//第三个加法：两个浮点数相加
	public static double add(double x,double y) {
		return x+y;
	}
}


