package BaiTapTCP;

import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;
public class ServerTCP {
	public static String Number(int i)
	{
		if(i==0)
			return "Khong";
		else if(i==1)
			return "Mot";
		else if(i==2)
			return "Hai";
		else if(i==3)
			return "Ba";
		else if(i==4)
			return "Bon";
		else if(i==5)
			return "Nam";
		else if(i==6)
			return "Sau";
		else if(i==7)
			return "Bay";
		else if(i==8)
			return "Tam";
		else if(i==9)
			return "Chin";
		else
			return "Khong phai so nguyen";
		
	}
	
    public static void main(String argv[]) throws Exception
    {
        String sentence_from_client;
        String sentence_to_client;
        
        //Tạo socket server, chờ tại cổng '3000'
        ServerSocket welcomeSocket = new ServerSocket(3000);
        
        while(true) {
            //chờ yêu cầu từ client
        	System.out.print("Server Connecting .....");
            Socket connectionSocket = welcomeSocket.accept();
            
            //Tạo input stream, nối tới Socket
            BufferedReader inFromClient =
                new BufferedReader(new
                    InputStreamReader(connectionSocket.getInputStream())); 
            
            //Tạo outputStream, nối tới socket
            DataOutputStream outToClient =
                new DataOutputStream(connectionSocket.getOutputStream());
            
            //Đọc thông tin từ socket
            sentence_from_client = inFromClient.readLine();
            try
            {
            	int i;
            	i= Integer.parseInt(sentence_from_client);
            	sentence_to_client ="Number  "+ i +" la "+Number(i)+ "\n" +"(Server accepted!)" + '\n';
            }
            catch (Exception e) {
            	sentence_to_client = sentence_from_client +"Not Find Number"+ "\n" +" (Server accepted!)" + '\n';
			}
            
            //ghi dữ liệu ra socket
            outToClient.writeBytes(sentence_to_client); 
            return;
        }
        
    }
}