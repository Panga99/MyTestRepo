package e;

public class Exceptions1 {
	
	public static void main(String[] args) {
		
		try {
		int i =20;
		int j = 0;
		int k = i/j;
		System.out.println(k);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("end");
		int a = 4;
		int b = 5;
		int c = a+b;
		System.out.println(c);
		
	}
}