package jh;

public class xs {
	//作业范围修饰符
	//private:类可见性 只在本类中可以使用，其他访问都是非法的
	//没有作用范围修饰符：可包见性 只在本包中可以使用 ，其他访问都是非法的
	//protected：子类可见性 只在包或者其他包中的子类可以使用，其他访问都是非法的
	//类的成员变量一般是private 这叫类的封装
	//如果使用成员变量，使用public的getter setter方法
	 String name;//姓名属性
	int score;//成绩属性
	//读取姓名
	//无参构造方法
	public xs() {}
	//有参构造方法
	public xs(String mz,int cj) {
		this.name = mz;
		this.score = cj;
	}
	
	public String getName() {
		return name;
	}
	//设置姓名
	public void setName(String name) {
		this.name = name;
	}
	//读取成绩
	public int getScore() {
		return score;
	}
	//设置成绩
	public void setScore(int score) {
		this.score = score;
	}
	
}
