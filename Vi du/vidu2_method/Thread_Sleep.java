package vidu2_method;

class Thread_Sleep extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
 
    public static void main(String args[]) {
    	Thread_Sleep t1 = new Thread_Sleep();
    	Thread_Sleep t2 = new Thread_Sleep();
 
        t1.start();
        t2.start();
    }
}