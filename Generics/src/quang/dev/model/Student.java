package quang.dev.model;

public class Student {
	private String id;
	private String name;
	private int age;
	private String addrees;
	private double point;
	public Student(String id, String name, int age, String addrees, double point) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.addrees = addrees;
		this.point = point;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddrees() {
		return addrees;
	}
	public void setAddrees(String addrees) {
		this.addrees = addrees;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return String.format("%-10s%-10s%-10d%-10s%-10.1f\n",id,name,age,addrees,point);
	}
}
