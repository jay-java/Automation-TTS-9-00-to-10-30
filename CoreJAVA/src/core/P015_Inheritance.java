package core;
//single
class A{//parent
	public void classA() {
		System.out.println("class A fun");
	}
}
class B extends A{//child
	public void classB() {
		System.out.println("class B fun");
	}
}
//multilevel
class C extends B{
	public void classC() {
		System.out.println("class C fun");
	}
}

//hierarchical
class D extends A{
	public void classD() {
		System.out.println("class D fun");
	}
}
public class P015_Inheritance {
	public static void main(String[] args) {
		B b = new B();
		b.classA();
		b.classB();
		C c = new C();
		c.classA();
		c.classB();
		c.classC();
		
		D d = new D();
		d.classA();
		d.classD();
	}
}
