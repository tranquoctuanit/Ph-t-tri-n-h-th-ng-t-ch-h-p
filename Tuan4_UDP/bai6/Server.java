package bai6;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Server {

	private int port;
	private int n;
	private InetAddress clientIP;
	private int clientPort;
	
	public Server(int port) {
		super();
		this.port = port;
	}

	void execute() throws IOException{
		//tao socket
		DatagramSocket server = new DatagramSocket(port);
		System.out.println("Server is listening... ");

		//nhan goi tin tu client
		int[] mangSo = new int[1];
		String [] arr_n = receiveData(server).split("_");

		mangSo[Integer.parseInt(arr_n[1])-1] = Integer.parseInt(arr_n[0]);
		n = mangSo[0];
		
		while(true) {

			//gui menu ve client
			sendMenu(menu(), server, clientIP, clientPort);

			//nhan tu chon tu client
			String[] arr_choose = receiveData(server).split("_");
			int choose = Integer.parseInt(arr_choose[0]);

			switch (choose) {
			case 1:

				sendData(sum1(n), -1, server, clientIP, clientPort);
				
				break;
			case 2:
				sendData(sum2(n), -1, server, clientIP, clientPort);
				break;	
			case 3:
				sendData(sum3(n), -1, server, clientIP, clientPort);
				break;
			case 4:
				
				break;
			default:
				break;
			}
			if(choose ==4) break;
		}
		server.close();

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

	//gui menu qua client
	private void sendMenu(String value, DatagramSocket server, InetAddress clientIP, int clientPort) throws IOException {
		byte[] temp = new byte[1024];
		temp = value.getBytes();
		DatagramPacket send_result_Packet = new DatagramPacket(temp, temp.length, clientIP, clientPort);
		server.send(send_result_Packet);
	}

	//tao menu
	private String menu() {
		String menu = "\n\n=================MENU================\n"
				+ "| 1. Tính tổng 1+3+5+7+...+(2n+1)   |\n"
				+ "| 2. Tính tổng 1*2 + 2*3+...+n*(n+1)|\n"
				+ "| 3. Tính tổng 1-2+3-4+...+(2n+1)  |\n"
				+ "| 4. Thoát                          |\n"
				+"=====================================\n";

		return menu;
	}
	
	//xu ly
	//Tổng 1+3+5+7+...+(2n+1)
	public static int sum1(int n) {
		if(n<1)
			return 0;
		int sum = 0;
		for(int i = 0; i<=n; i++) {
			sum += (2 * i + 1);
		}
		return sum;
	}

	//Tổng 1*2 + 2*3+...+n*(n+1)
	public static int sum2(int n) {

		int sum = 0;
		for(int i=0;i<=n;i++) {
			sum+=(i*(i+1));
		}
		return sum;
	}

	//Tong 1-2+3-4+...+(2n+1)4
	public static int sum3(int n) {

		int sum = 0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum-=i;
			}
			else {
				sum+=i;
			}

		}
		return sum;
	}
}
