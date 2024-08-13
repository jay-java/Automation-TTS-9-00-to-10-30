package core;

class Student {
	private int id;
	private String name;
	private double per;

	Student() {

	}

	Student(int id, String name, double per) {
		this.id = id;
		this.name = name;
		this.per = per;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public double getPer() {
		return per;
	}
	
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" per : "+per;
	}

}

public class P013_Encapsulation {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(12);
		s1.setName("java");
		s1.setPer(56.4);
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getPer());
		
		Student s2 = new Student(2, "python",67.5);
//		s2.id=13;
//		System.out.println(s2.getId());
		System.out.println(s2);
	}
}
