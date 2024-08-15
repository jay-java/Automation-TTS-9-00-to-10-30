package core;

interface inter1 {
	public void interface1();

	public static void staticInterface1() {
		System.out.println("static in interface 1");
	}
}

interface inter2 extends inter1 {
	public void interface2();

	public static void staticInterface2() {
		System.out.println("static in interface 2");
	}
}

interface inter3 {
	public void interface3();

	public static void staticInterface3() {
		System.out.println("static in interface 1");
	}
}

class InterCall implements inter2, inter3 {

	public void interface1() {
		System.out.println("interface 1");
	}

	public void interface3() {
		System.out.println("interface 3");
	}

	public void interface2() {
		System.out.println("interface 2");
	}

}

public class P019_INterface {
	public static void main(String[] args) {
		InterCall i = new InterCall();
		i.interface1();
		i.interface2();
		i.interface3();
		inter1.staticInterface1();
		inter2.staticInterface2();
		inter3.staticInterface3();
	}
}
