package ktra;

public class Sochinhphuong implements Runnable{

	private double n;
	public static boolean  sochinhphuong(double n) {

		double sq = Math.sqrt(n);
		if(sq *sq ==n) {
			return true;
		}
		else
			return false;

	}
	public Sochinhphuong(double n) {
		super();
		this.n = n;
	}

	@Override
	public void run() {
		if (sochinhphuong(this.n))
			System.out.println("So " + this.n + " La so chinh phuong");
		else
			System.out.println("So " + this.n + " khong phai la so chinh phuong");
	}

}




