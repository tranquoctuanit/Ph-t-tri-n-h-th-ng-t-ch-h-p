package test1;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
	public static void main(String args[]) throws Exception {
		// tạo socket phía client
		DatagramSocket clientSocket = new DatagramSocket(3000);
		// Tạo địa chỉ IP address bỏi tên "localhost)
		InetAddress IPAddress = InetAddress.getByName("localhost");
		while (true) {
			byte[] sendData = new byte[1024];
			byte[] receiveData = new byte[2048];     
			System.out.println("Menu");
			System.out.println("1. Tổng 1+3+5+7+...+(2n+1)");
			System.out.println("2. Tổng 1*2 + 2*3+...+n*(n+1)");
			System.out.println("3. Biểu thức 1-2+3-4+...+(2n+1)4");
			System.out.print("Nhập Số - n :");
			BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
			String sentence = inFromUser.readLine();
			sendData = sentence.getBytes();
			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 8000);
			clientSocket.send(sendPacket);
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			clientSocket.receive(receivePacket);
			String modified_Sentence = new String(receivePacket.getData());
			System.out.println("FROM SERVER:" + modified_Sentence);

			if (sentence.compareTo("exit") == 0)
				break;
		}
		clientSocket.close();
	}
}