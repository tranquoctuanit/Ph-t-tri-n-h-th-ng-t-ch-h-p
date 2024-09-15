package vidu4_synchronizedMethod;

public class Thread2 extends Thread{
	Table t;
	Thread2(){
		this.t = t;
	}
	
	 public Thread2(Table t) {
		super();
		this.t = t;
	}

	public Table getT() {
		return t;
	}

	public void setT(Table t) {
		this.t = t;
	}

	public void run() {
		 t.printTable(100);
	 }
}
