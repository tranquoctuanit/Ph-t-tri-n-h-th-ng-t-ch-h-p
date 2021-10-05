package vidu4_synchronizedMethod;

public class Thread1  extends Thread{
	Table t;
	Thread1(){
		this.t = t;
	}
	 public void run() {
		 t.printTable(6);
	 }
}
