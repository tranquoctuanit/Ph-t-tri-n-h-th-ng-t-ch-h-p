package bai3;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MultiCheckingThread extends Thread {
	int n;
	String name;
	MultiCheck sq = new MultiCheck();
	public MultiCheckingThread(int n, String name) {
		super();
		this.n = n;
		this.name = name;
	}
	
	
	@Override
	public void run() {
		try {
			System.out.println(name+sq.BS(n));
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
