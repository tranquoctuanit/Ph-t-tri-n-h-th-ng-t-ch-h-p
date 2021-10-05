package bai1;

public class Mul implements Runnable{

	@Override
	public void run() {
		System.out.println("thread is running...");
		for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
	}

}