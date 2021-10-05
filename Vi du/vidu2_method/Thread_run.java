package vidu2_method;

class Thread_run extends Thread {
    public void run() {
        System.out.println("running...");
    }
 
    public static void main(String args[]) {
        Thread_run t1 = new Thread_run();
        t1.run();
    }
}