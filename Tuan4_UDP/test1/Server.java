package test1;

import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class Server {

	public static void main(String args[]) throws Exception {
	
		DatagramSocket serverSocket = new DatagramSocket(8000);
		while (true) {
			System.out.println("Da ket noi");
			// tạo biến receiveData để nhận dữ liệu từ gói tin đến
			byte[] receiveData = new byte[1024];
			// tạo sendData để nhận dữ liệu gửi lên gói tin đi
			byte[] sendData = new byte[2048];
//            
			// tạo biến receivePacket để nhận gói tin từ socket
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			// nhận gói tin qua phương thức receive()
			serverSocket.receive(receivePacket);
			// Chuyển dữ liệu vừa nhận về dạng String
			String sentence = new String(receivePacket.getData());
			String[] part = sentence.split("-");
			String key = part[0];
			String n1 = part[1].trim();
			int n = Integer.valueOf(n1);
			int sum = 0;

			// Lấy địa chỉ IP của bên gửi
			InetAddress IPAddress = receivePacket.getAddress();
			// Lấy số hiệu cổng bên gửi
			int port = receivePacket.getPort();
			// Xử lý dữ liệu vừa nhận

			

			if (key.equalsIgnoreCase("1")) {
				for (int i = 0; i <= n; i++) {
					sum += (2 * i + 1);
				}
				String sentence_to_client = sum + " (server accpeted!)";
				sendData = sentence_to_client.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
				// Gửi gói tin đi
				serverSocket.send(sendPacket);
			}
			if (key.equalsIgnoreCase("2")) {
				for(int i=1;i<=n;i++) {
					sum+=(i*(i+1));
				}
				String sentence_to_client = sum + " (server accpeted!)";
				sendData = sentence_to_client.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
				// Gửi gói tin đi
				serverSocket.send(sendPacket);
			}
			if (key.equalsIgnoreCase("3")) {
				for(int i=1;i<=n;i++) {
					if(i%2==0) {
						sum-=i;
					}
					else {
						sum+=i;
					}
				}
				String sentence_to_client = sum + " (server accpeted!)";
				sendData = sentence_to_client.getBytes();
				DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
				// Gửi gói tin đi
				serverSocket.send(sendPacket);
			}

			// tạo gói tin để gửi đi client

		}
	}
}
