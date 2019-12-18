package page001;

public class text {
	

	public text() {
	System.out.println("构造方法一被调用了");
	}
	public text(int x) {
		this();
		System.out.println("构造方法二被调用了");
		}
	public text(boolean b) {
		this(1);
		System.out.println("构造方法三被调用了");
		}
	public static void main(String[] args) {
		new text (true);

	}

}
