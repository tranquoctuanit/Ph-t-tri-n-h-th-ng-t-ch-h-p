package bai3;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MultiCheck {
	List<String> list = new ArrayList<>();
	int n;

	public synchronized void SaveFile(int n) {
		BufferedWriter bw = null;
        FileWriter fw = null;
 
        try {
            String data ="@@@@@@@@@@      "+"In ket qua Thread: "+BS(n)+" @@@@@@@@@@         " + "\n";
            File file = new File("T:\\\\Hoc\\\\Phat trien he thong tich hop\\\\Thuc Hanh\\\\Phat-trien-he-thong-tich-hop\\\\BaiTap_TH\\\\bai3\\\\data.txt");
            // nếu tệp không tại thì tạo tệp
            if (!file.exists()) {
                file.createNewFile();
            }
            // true = append file
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
	}
	
	public String BS(int n) {
		String kq="";
		for(int i =1;i<=5;i++) {
			kq+=n*i+"  ";
		}
		return kq+" là bội số của "+n;
	}
	
}
