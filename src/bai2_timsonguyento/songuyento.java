package bai2_timsonguyento;

public class songuyento implements Runnable {

	public void run()
	{
		for(int i=1; i<=100;i++)
		{
			int sont =0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					sont=1;
			}
			if(sont==0)
			{
				System.out.println("Thread running name is:"
						+ Thread.currentThread().getName()+":  "+i);
			}
			try 
			{
				Thread.sleep(500);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

}