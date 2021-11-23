package bai1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;

public class AppClient{
	public static void main(String[] args) {
		String a ;
		char b,c;
		int n;
		
		try
		{
			//Trỏ đến địa chỉ ở Server
			String url = "//localhost:2001/chain";
			IChain remoteObject = (IChain)Naming.lookup(url);

			Scanner sc = new Scanner(System.in);
			String nhap="";

			while(!nhap.equals("exit")) {
				System.out.println("------------Menu----------");
				System.out.println("1. Đảo ngược và in hoa chuỗi");
				System.out.println("2. Đếm số lượng các từ trong chuỗi");
				System.out.println("3. Đếm số lần xuất hiện của các ký tự hoa trong chuỗi");
				System.out.println("4. Chuyển ký tự đầu sau dấu cách thành in hoa");
				System.out.println("5. Thay thể ký tự trong chuỗi");
				System.out.println("6. Đếm số lượng ký tự trong chuỗi");
				System.out.println("7. Đếm số lần xuất hiện ký tự nhập từ bàn phím trong chuỗi");
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
					System.out.println("Kết quả\nSố từ hoa trong chuỗi là :" + remoteObject.DemTu(a) + "\n");
					break;
				case "3":
					System.out.print("Nhập vào chuỗi: "); 
					a = sc.nextLine();
					System.out.println("Kết quả\nSố ký tự in hoa trong chuỗi là : " + remoteObject.DemSoKyTuHoa(a) + "\n");
					break;
				case "4":
					System.out.print("Nhập vào chuỗi: "); 
					a = sc.nextLine();
					System.out.println("Kết quả\nIn hoa trong chuỗi là : " + remoteObject.ChuHoaDau(a) + "\n");
					break;
				case "5":
					System.out.print("Nhập vào chuỗi: "); 
					a = sc.nextLine();
					System.out.print("Nhập vào ký tự cần thay thế: "); 
					b = sc.next().charAt(0);
					System.out.print("Nhập vào ký tự thay thế: "); 
					c = sc.next().charAt(0);
					System.out.println("Kết quả\nThay thế ký tự trong chuỗi là : " + remoteObject.ThayTheKyTu(a, b, c) + "\n");
					break;
				case "6":
					System.out.print("Nhập vào chuỗi: "); 
					a = sc.nextLine();
					System.out.println("Kết quả\nSố ký tự trong chuỗi là : " + remoteObject.DemSoKyTu(a) + "\n");
					break;
				case "7":
					System.out.print("Nhập vào chuỗi: "); 
					a = sc.nextLine();
					System.out.print("Nhập vào ký tự cần đếm: "); 
					b = sc.next().charAt(0);
					System.out.println("Kết quả\nSố lần xuất hiện ký tự" + b +"trong chuỗi là : " + remoteObject.DemKyTu(a, b) + "\n");
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

