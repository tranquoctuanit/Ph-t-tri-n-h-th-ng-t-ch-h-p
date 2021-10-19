package bai6;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Server {

	private int port;
	private int a,b,c,d;
	private InetAddress clientIP;
	private int clientPort;
	public Server(int port) {
		super();
		this.port = port;
	}

	private void execute() throws IOException{
		//tao socket
		DatagramSocket server = new DatagramSocket(port);
		System.out.println("Server is listening... ");

		//nhan goi tin tu client
		int[] mangSo = new int[1];
		String [] arr_a = receiveData(server).split("_");

		mangSo[Integer.parseInt(arr_a[1])-1] = Integer.parseInt(arr_a[0]);
		

		a = mangSo[0];
		

		while(true) {

			//gui menu ve client
			sendMenu(menu(), server, clientIP, clientPort);

			//nhan tu chon tu client
			String[] arr_choose = receiveData(server).split("_");
			int choose = Integer.parseInt(arr_choose[0]);

			switch (choose) {
			case 1:
				
				sendData(sum1(a), -1, server, clientIP, clientPort);
				break;
			case 2:

				break;	
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			case 9:

				break;
			default:
				break;
			}
			if(choose ==10) break;
		}
		server.close();

	}

	public static void main(String[] args) throws IOException {
		Server server = new Server(3000);
		server.execute();
	}

	private String receiveData(DatagramSocket client) throws IOException {
		byte[] temp = new byte[1024];
		DatagramPacket  receive_DP = new DatagramPacket(temp, temp.length);
		client.receive(receive_DP);
		clientIP = receive_DP.getAddress();
		clientPort = receive_DP.getPort();
		return new String(receive_DP.getData()).trim();
	}

	private void sendData(int value, int index, DatagramSocket server, InetAddress clientIP, int clientPort) throws IOException {
		byte[] temp = new byte[1024];
		String str = String.valueOf(value) + "_" + index;
		temp = str.getBytes();
		DatagramPacket send_result_Packet = new DatagramPacket(temp, temp.length, clientIP, clientPort);
		server.send(send_result_Packet);
	}

	private void sendMenu(String value, DatagramSocket server, InetAddress clientIP, int clientPort) throws IOException {
		byte[] temp = new byte[1024];
		temp = value.getBytes();
		DatagramPacket send_result_Packet = new DatagramPacket(temp, temp.length, clientIP, clientPort);
		server.send(send_result_Packet);
	}

	private String menu() {
		String menu = "\n\n==================MENU===============\n"
				+ "1.Tinh tong 1+3+5+7+...+(2n+1)\n"
				+ "2.Tim boi chung nho nhat\n"
				+ "3.Sap xep tang dan\n"
				+ "4.Sap xep giam dan\n";
		return menu;
	}
	
	
	public static int sum1(int n) {
		if(n<1)
			return 0;
		int sum = 0;
		for(int i=1; i<=n;i=i+2) {
			sum +=i;
		}
		return sum;
	}
	
	
	

}
