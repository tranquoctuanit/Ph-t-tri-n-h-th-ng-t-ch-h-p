package bai1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ghifile extends Thread {
	String tenFile;

	public Ghifile(String tenFile) {
		super();
		this.tenFile = tenFile;
	}

	public void run() {

		FileOutputStream fos = null;
		File file;
		int numberOfCharactor = 20;
		random rand = new random();
		String mycontent = "BÀI TẬP THỰC HÀNH bai 1 - Tran Quoc Tuan 17070831 \r\n" + "Day so ngau nhien: "
				+ rand.randomAlphaNumeric(numberOfCharactor);
		try {
			file = new File(tenFile);
			fos = new FileOutputStream(file);
			if (!file.exists()) {
				file.createNewFile();
			}
			byte[] bytesArray = mycontent.getBytes();
			fos.write(bytesArray);
			fos.flush();
			System.out.println("File Written Successfully");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException ioe) {
				System.out.println("Error in closing the Stream");
			}
		}
	}
}