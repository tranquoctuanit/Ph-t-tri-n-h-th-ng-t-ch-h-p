package vidu4_synchronizedMethod;

public class Thread1  extends Thread{
	Table t;
	Thread1(){
		this.t = t;
	}
	
	 public Table getT() {
		return t;
	}

	public void setT(Table t) {
		this.t = t;
	}

	public Thread1(Table t) {
		super();
		this.t = t;
	}

	public void run() {
		 t.printTable(6);
	 }
}
