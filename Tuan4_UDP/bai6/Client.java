package bai6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {
	private InetAddress host;
	private int port;
	private int n;
	private Scanner sc = new Scanner(System.in);

	public Client(InetAddress host, int port) {
		super();
		this.host = host;
		this.port = port;
	}

	void execute() throws IOException{
		DatagramSocket client = new DatagramSocket();

		//nhap du lieu
		n = input("Nhap vao so n : ");

		//dong goi packet
		DatagramPacket n_DP = createPacket(n, 1);


		//gui ca packet den server

		client.send(n_DP);

		while(true) {
			//nhan menu va in ra man hinh
			System.out.println(receiveData(client));
			int choose = input("Nhập vào tùy chọn của bạn : ");

			//gui tuy chon den server
			DatagramPacket choose_DP = createPacket(choose, -1);
			client.send(choose_DP);

			switch (choose) {
			case 1:
				String sum1[] = receiveData(client).split("_");

				System.out.println("Tổng 1+3+5+7+...+(2n+1) = " + sum1[0] + "\n");
				break;
			case 2:
				String sum2[] = receiveData(client).split("_");
				System.out.println("Tổng 1*2 + 2*3+...+n*(n+1) =  " + sum2[0] + "\n");
				break;	
			case 3:
				String sum3[] = receiveData(client).split("_");
				System.out.println("Tổng 1-2+3-4+...+(2n+1)4 = " + sum3[0] + "\n");
				break;
			case 4:

				break;
			default:
				System.out.println("Vui lòng chọn sô trong menu");
				break;
			}
			if(choose ==4) break;

		}
		client.close();

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
