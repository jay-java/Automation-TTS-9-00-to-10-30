package core;

final class XYZ{
	final int i =1;
	final public void change() {
		i++;
		System.out.println("change in XYZ class"+i);
	}
}
class ZZ extends XYZ{
	public void change() {
		System.out.println("change in ZZ class");
	}
}
public class P018_Final {
	public static void main(String[] args) {
		XYZ x = new XYZ();
		x.change();
	}
}
