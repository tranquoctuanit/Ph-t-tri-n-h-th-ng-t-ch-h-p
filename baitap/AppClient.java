package baitap;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

public class AppClient{
	public static void main(String[] args) {
		String a ;
		try
		{
			String url = "//localhost:2001/chain";
			IChain remoteObject = (IChain)Naming.lookup(url);

			Scanner sc = new Scanner(System.in);
			String nhap="";

			while(!nhap.equals("exit")) {
				System.out.println("------------Menu----------");
				System.out.println("1. Đảo ngược và in hoa chuỗi");
				System.out.println("2. Đếm số lượng các từ trong chuỗi");
				System.out.println("Nhập exit để thoát\n");
				System.out.println("Nhập vào tùy chọn của bạn : ");
				nhap = sc.nextLine();
				switch (nhap) {	 
				case "1":
					System.out.print("Nhập vào chuỗi: "); 
					a = sc.nextLine();
					System.out.println("Kết quả " + remoteObject.DaoNguoc(a) + "\n");
					break;
				case "2":
					System.out.print("Nhập vào chuỗi: "); 
					a = sc.nextLine();
					System.out.println("Kết quả " + remoteObject.DemTu(a) + "\n");
					break;

				default:
					System.out.print("Chương trình đã dừng");
					break;
				}
			}
			sc.close();

		}
		catch (RemoteException exc) 
		{
			System.out.println("Error in lookup: " + exc.toString()); 
		}
		catch (java.net.MalformedURLException exc) {
			System.out.println("Malformed URL: " + exc.toString()); 
		}
		catch (java.rmi.NotBoundException exc) {
			System.out.println("NotBound: " + exc.toString());
		} 
	}
}

