package bai3;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiCheck sq = new MultiCheck();
		File file = new File("T:\\Hoc\\Phat trien he thong tich hop\\Thuc Hanh\\Phat-trien-he-thong-tich-hop\\BaiTap_TH\\bai3\\data.txt");
		file.delete();
		Random random = new Random();
		int n1 = random.nextInt(10) + 1;
		int n2 = random.nextInt(10) + 1;
		int n3 = random.nextInt(10) + 1;
		MultiCheckingThread t1 = new MultiCheckingThread(n1, "Thread t1: ");
		MultiCheckingThread t2 = new MultiCheckingThread(n2, "Thread t2: ");
		MultiCheckingThread t3 = new MultiCheckingThread(n3, "Thread t3: ");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
		sq.SaveFile(n3);
		sq.SaveFile(n2);
		sq.SaveFile(n1);
	}

}
