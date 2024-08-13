package core;

class Overload {
	public int add(int i, int j) {
		return i + j;
	}

	public int add(int i, int j, int k) {
		return i + j + k;
	}
}

class Parent {
	public void call() {
		System.out.println("parent class");
	}
	public void aaaa() {
		System.out.println("parent class");
	}
}

class Child extends Parent{
	public void call() {
		super.call();
		System.out.println("child class");
	}
}

public class P016_Polymorphism {
	public static void main(String[] args) {
		Overload o = new Overload();
		int res1 = o.add(1, 2);
		System.out.println(res1);
		int res2 = o.add(1, 2, 3);
		System.out.println(res2);
		
		Child c = new Child();
		c.call();
	}
}
