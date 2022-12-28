package th;

class Mythread extends Thread{
	public void car() {
		for(int i = 0; i<20; i++) {
		try {
			sleep(1000);
			System.out.println(i);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	}
}
public class Expthread {
    public static void main(String[] args) {
    	
//		Thread t = new Mythread();
//		Thread t2 = new Mythread();
//		t.start();
//		t2.start();
//		System.out.println(t);
		Mythread mh = new Mythread();
		mh.start();
		mh.car();
	}
}