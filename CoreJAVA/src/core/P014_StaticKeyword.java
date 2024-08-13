package core;
class AA{
	public void call() {
		System.out.println("call in AA class");
	}
	public static void show() {
		System.out.println("show in aa class static");
	}
}
public class P014_StaticKeyword {
	public static void main(String[] args) {
		AA a = new AA();
		a.call();
		AA.show();
	}
}
