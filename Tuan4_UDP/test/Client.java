package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;


public class Client {
	private InetAddress host;
	private int port;
	private int a;
	private Scanner sc = new Scanner(System.in);

	public Client(InetAddress host, int port) {
		super();
		this.host = host;
		this.port = port;
	}

	private void execute() throws IOException{
		DatagramSocket client = new DatagramSocket();

		//nhap du lieu
		a = input("Nhap vao so a : ");
		
		//dong goi packet
		DatagramPacket a_DP = createPacket(a, 1);
		

		//gui ca packet den server

		client.send(a_DP);
		
		while(true) {
			//nhan menu va in ra man hinh
			System.out.println(receiveData(client));
			int choose = input("Nhap vao tuy chon cua ban: ");

			//gui tuy chon den server
			DatagramPacket choose_DP = createPacket(choose, -1);

			switch (choose) {
			case 1:
				
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
		}

	}

	//ham nhan data
	private String receiveData(DatagramSocket client) throws IOException {
		byte[] temp = new byte[1024];
		DatagramPacket  receive_DP = new DatagramPacket(temp, temp.length);
		client.receive(receive_DP);
		return new String(receive_DP.getData()).trim();
	}

	private DatagramPacket createPacket(int data, int index) {
		String str = String.valueOf(data) + "_" + index;
		byte[] arrData = str.getBytes();

		return new DatagramPacket(arrData, arrData.length, host, port);
	}


	private int input(String request) {
		// TODO Auto-generated method stub
		int number = 0;
		boolean flag = true;
		do {
			try {

				System.out.println(request);
				number = Integer.parseInt(sc.nextLine());
				flag = false;

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Du lieu khong dung dinh dang.Vui long nhap lai");
			}
		}while(flag);
		return number;
	}


}
