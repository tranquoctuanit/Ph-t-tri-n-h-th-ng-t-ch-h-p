package vidu4_synchronizedMethod;

public class Thread2 extends Thread{
	Table t;
	Thread2(){
		this.t = t;
	}
	 public void run() {
		 t.printTable(100);
	 }
}
