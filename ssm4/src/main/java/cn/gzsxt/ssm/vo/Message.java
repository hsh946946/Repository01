package cn.gzsxt.ssm.vo;

public class Message {
	private int id;
	private String des;
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(int id, String des) {
		super();
		this.id = id;
		this.des = des;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", des=" + des + "]";
	}
	
	

}
