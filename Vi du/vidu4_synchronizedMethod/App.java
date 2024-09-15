package vidu4_synchronizedMethod;

public class App{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table tb = new Table();
		Thread1 t1 = new Thread1(tb);
		Thread2 t2 = new Thread2(tb);
		
		t1.start();
		t2.start();

	}

}
