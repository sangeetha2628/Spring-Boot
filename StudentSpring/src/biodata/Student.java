package biodata;

public class Student {

	int id;
	String name;
	int age;
	String dept;
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Student(int id, String name, int age, String dept) {
		//super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	
	public String getDept() {
		return dept;
	}
	}
	
	
	

