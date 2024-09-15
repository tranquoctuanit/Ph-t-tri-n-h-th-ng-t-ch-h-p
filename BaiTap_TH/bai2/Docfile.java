package bai2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Docfile extends Thread {
	String tenFile;

	public Docfile(String tenFile) {
		super();
		this.tenFile = tenFile;
	}

	public void run() {
		try {
			File f = new File(tenFile);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			fr.close();
			br.close();
		} catch (Exception ex) {
			System.out.println("Loi doc file: " + ex);
		}

	}
}

