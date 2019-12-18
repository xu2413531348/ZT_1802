package page001;

public class fibonacci {
	public static int f(int n) {
			if(n==1) {
				return 0;
			}
			if(n==2) {
				return 1;
			}
			return f(n-1)+f(n-2);	
	}
	public static void main(String[] args) {
		System.out.println("斐波那契额的第三个数值是"+f(3));

	}

}
