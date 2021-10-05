package bai3_poolThread;

public class Fibonaci implements Runnable{

	private int n;
	int Fibonaci(int n) {
		int f0 = 0, f1 = 1, fn=1;
		if(n<0)
			return -1;
		else 
			if ( n == 0 || n==1 )
				return n;
			else
			{
				for(int i = 2; i<n;i++)
				{
					f0 = f1;
					f1 = fn;
					fn = f0 + f1;
				}

			}
		return fn;
	}
	public Fibonaci(int n) {
		super();
		this.n = n;
	}

	@Override
	public void run() {
		System.out.println("Fibonaci " + n + " = "+ this.Fibonaci(this.n));

	}
}
