package bai3_poolThread;

public class Worker implements Runnable {
 
	    private String message;
	 
	    public Worker(String s) {
	        this.message = s;
	    }
	 
	    public void run() {
	        System.out.println(Thread.currentThread().getName() 
	                + " (Start) Fibonacci = " + message);
	        processMessage();
	        System.out.println(Thread.currentThread().getName() 
	                + " (End)");
	    }
	 
	    private void processMessage() {
	        try {
	            Thread.sleep(1500);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	}