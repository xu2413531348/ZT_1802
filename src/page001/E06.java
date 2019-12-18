package page001;

public class E06 {

	public static void main(String[] args) {
		int x=0;
		int y=0;
		int z=0;
		boolean a,b;
		a=x>0 & y++>1;
		//&是逻辑与符号，尽管&的左边的值为false，右边也要进行判断
		System.out.println("a="+a);
		System.out.println("y="+y);
		//&&是短路与符号，只要&&左边的值为false。右边就不进行判断
		b=x>0 && z++>1;
		System.out.println("b="+b);
		System.out.println("z="+z);
		
		//条件运算符？:
		int store=120;
		System.out.println(store<=0?"库存没有啦！" : store>100?"库存太多了":"库存量为:"+store);
		

	}

}
