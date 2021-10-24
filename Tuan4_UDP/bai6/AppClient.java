package bai6;

import java.io.IOException;
import java.net.InetAddress;

public class AppClient {
	
	public static void main(String[] args) throws IOException {
		Client client = new Client(InetAddress.getLocalHost(), 3000);
		client.execute();
	}

}
