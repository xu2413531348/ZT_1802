package jh;

public class kecheng {
	private String course_id;
	private String course_name;
	private String course_book;
	//如果没有任何构造方法 java vm会自动创建一个无参数的构造方法
	//如果创建了一个构造方法 java vm会自动创建一个有参数的构造方法
	public kecheng() {}
	public kecheng(String course_name, String course_book) {
		this.course_name = course_name;
		this.course_book = course_book;
	}
	//读取课程id
	public String getCourse_id() {
		return course_id;
	}
	//设置课程id
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	//读取课程名
	public String getCourse_name() {
		return course_name;
	}
	//设置课程名
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	//读取参考教材
	public String getCourse_book() {
		return course_book;
	}
	//设置参考教材
	public void setCourse_book(String course_book) {
		this.course_book = course_book;
	}
}
