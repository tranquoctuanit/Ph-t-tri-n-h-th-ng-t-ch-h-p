package ktra;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class App {

	public static void main(String[] args) {


		ExecutorService executor = Executors.newFixedThreadPool(5);

		Runnable worker1 = new Sochinhphuong(6);
		executor.execute(worker1);
		Runnable worker2 = new Sochinhphuong(9);
		executor.execute(worker2);
		Runnable worker3 = new Sochinhphuong(15);
		executor.execute(worker3);
		Runnable worker4 = new Sochinhphuong(20);
		executor.execute(worker4);
		Runnable worker5 = new Sochinhphuong(16);
		executor.execute(worker5);

		executor.shutdown();
		while (!executor.isTerminated()) {
		}

		System.out.println("Finished all threads");
	}
}