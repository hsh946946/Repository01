package cn.gzsxt.ssm.domain;

public class User {
	private Integer id;
	private String name;
	private String passoword;
	private Integer age;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String passoword, Integer age) {
		super();
		this.name = name;
		this.passoword = passoword;
		this.age = age;
	}

	public User(Integer id, String name, String passoword, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.passoword = passoword;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassoword() {
		return passoword;
	}

	public void setPassoword(String passoword) {
		this.passoword = passoword;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", passoword=" + passoword + ", age=" + age + "]";
	}
	

}
