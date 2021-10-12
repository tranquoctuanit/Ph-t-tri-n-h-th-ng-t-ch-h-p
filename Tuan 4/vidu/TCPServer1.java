package vidu;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer1 {
	public final static int serverPort = 3000;
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(serverPort);
			System.out.println("Server da duoc tao");
			while(true) {
				try {
					Socket s = ss.accept();
					RequestProcessing rp = new RequestProcessing(s);
					rp.start();
					
				} catch (IOException ie1) {
					// TODO: handle exception
					System.out.println("Connect Error: "+ie1);
				}
			}
		} catch (IOException ie) {
			// TODO: handle exception
			System.out.println("Server creation Error: " +ie);
		}
	}
	
}
