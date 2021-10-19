package bai5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Date;

public class Server {
	
	private static final int Port = 3000;
	
	public static void main(String[] args) {
		try {
			
			DatagramSocket socket = new DatagramSocket(Port);
			
			while(true) {
				//nhan du lieu tu client
				byte[] inputByte = new byte[1];
				DatagramPacket inputPack = new DatagramPacket(inputByte, 0);
				socket.receive(inputPack);
				
				//xu ly
				Date date = new Date();
				String outputStr = date.toString();
				
				//gui du lieu cho client
				byte[] outputByte = outputStr.getBytes();
				DatagramPacket outputPack = new DatagramPacket(outputByte, outputByte.length, inputPack.getAddress(),inputPack.getPort());
				socket.send(outputPack);
				
				
			}
			
		} catch (IOException ex) {
			// TODO: handle exception
			System.out.println("Loi Server : " + ex.toString());
		}
	}
		
}
