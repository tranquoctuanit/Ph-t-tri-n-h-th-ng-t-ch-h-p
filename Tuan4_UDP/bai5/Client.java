package bai5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
	private static final int Port = 3000;
	
	public static void main(String[] args) {
		try {
			
			DatagramSocket socket = new DatagramSocket();
			InetAddress serverAddress = InetAddress.getByName("127.0.0.1");
			Scanner scn = new Scanner(System.in);
			
			while(true) {
				System.out.println("Nhap yeu cau");
				String request = scn.nextLine();
				byte[] outputByte = request.getBytes();
				
				DatagramPacket outputPack = new DatagramPacket(outputByte, outputByte.length, serverAddress, Port);
				socket.receive(outputPack);
				
				byte[] inputByte = new byte[60000];
				
				DatagramPacket inputPack = new DatagramPacket(inputByte, inputByte.length);
				socket.receive(inputPack);
				
				
				String inputStr = new String(inputPack.getData(),0,inputPack.getLength());
				System.out.println("Ngay gio he thong la : " + inputStr);
				
				
				
			}
			
		} catch (IOException ex) {
			// TODO: handle exception
			System.out.println("Loi Client: " + ex.toString());
		}
	}
}
