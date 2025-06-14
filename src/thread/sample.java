package thread;

class demo{	
	public static void m1() {		
			for (int i = 0; i < 11; i++) {
				try {
					Thread.sleep(1000);
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
				
			}
	}
	public static void m2() {		
		for (int i = 0; i < 11; i++) {
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
	}
}

class tester1 extends Thread{
	public void run() {
		demo.m1();
	}
}
class tester2 extends Thread{
	public void run() {
		demo.m2();
	}
}


public class sample {
	public static void main(String[] args) {
		
		tester1 test1 = new tester1();
		Thread t1 = new Thread(test1);
		t1.start();
		
		tester2 test2 = new tester2();
		Thread t2 = new Thread(test2);
		t2.start();
	}

}
