package struts.lms.entity;

public class Info {
	private String id;
	private String name;
	private String sex;
	private int age;
	private String telephone;
	public Info(String id, String name, String sex, int age, String telephone) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.telephone = telephone;
	}
	public Info() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
