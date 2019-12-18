package object;

public class person   {
	public String sfzh;
	public String name;
	public String getSfzh() {
		return sfzh;
	}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public person() {}
	public person(String sfzh, String name) {
		super();
		this.sfzh = sfzh;
		this.name = name;
	}
	
	

}
