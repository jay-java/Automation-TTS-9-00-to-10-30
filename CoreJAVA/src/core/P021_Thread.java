package core;
//1.By Thread class
//2.By Runnable interface
class XY extends Thread{
	public void run() {
		long startTime  = System.currentTimeMillis();
		for(int i=1;i<=5;i++) {
			System.out.println("XY thread : "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
}
class XZ implements Runnable{
	public void run() {
		long startTime  = System.currentTimeMillis();
		for(int i=1;i<=5;i++) {
			System.out.println("XY thread : "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
}
public class P021_Thread {
	public static void main(String[] args) {
		XY x = new XY();
		x.run();
		XZ z = new XZ();
		z.run();
		
		
		
		
		
//		Thread t = new Thread();
//		System.out.println(t.currentThread());
//		t.setName("MyThread");
//		System.out.println(t);
//		long startTime  = System.currentTimeMillis();
//		for(int i=1;i<=5;i++) {
//			System.out.println(i+" : "+t);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println(endTime-startTime);
	}
}
