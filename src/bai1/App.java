package bai1;

public class App {

	public static void main(String[] args) {
		Mul m1 = new Mul();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m1);
		t1.start();
		t2.start();

	}

}
