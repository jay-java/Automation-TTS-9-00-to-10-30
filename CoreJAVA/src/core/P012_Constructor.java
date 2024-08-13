package core;

class Data {
	int i;
	String name;

	Data() {
		System.out.println("default cons");
	}

	Data(int i) {
		this.i = i;
		System.out.println("second cons : i = " + i);
	}

	Data(int i, String name) {
		this.i = i;
		this.name = name;
		System.out.println("second cons : i = " + i + " name : " + name);
	}

	public void show() {
		System.out.println("show fun in data class : " + i);
	}
}

public class P012_Constructor {
	public static void main(String[] args) {
		Data d = new Data();
		d.show();
		Data d1 = new Data(12);
		d1.show();
		Data d2 = new Data(12, "java");

	}
}
