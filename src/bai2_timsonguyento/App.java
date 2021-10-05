package bai2_timsonguyento;

import bai1.Mul;

public class App {
	public static void main(String[] args) {
		songuyento m1 = new songuyento();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m1);
		t1.start();
		t2.start();

	}
}
