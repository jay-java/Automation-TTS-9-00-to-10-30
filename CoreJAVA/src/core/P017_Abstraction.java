package core;

abstract class RBI {
	abstract public void interest();
	abstract public void HL();
	public void anyu() {
		
	}
	public static void repoRate() {
		System.out.println("repo Rate +- 4%");
	}
}

class SBI extends RBI {

	public void interest() {
		System.out.println("sbi interest : 3%");
	}

	public void HL() {
		System.out.println("SBI HL 7%");
	}

}

class HDFC extends RBI {

	public void interest() {
		System.out.println("hdfc interest : 3.5%");
	}

	public void HL() {
		System.out.println("HDFC HL : 8%");
	}

}

class JAVA extends RBI {

	public void interest() {
		System.out.println("JAVA interest : 4%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("HDFC HL : 8.5%");
	}

}

public class P017_Abstraction {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.interest();
		s.HL();
		HDFC h = new HDFC();
		h.interest();
		h.HL();
		JAVA j = new JAVA();
		j.interest();
		j.HL();
		SBI.repoRate();
		HDFC.repoRate();
		JAVA.repoRate();
	}
}
