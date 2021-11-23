package bai1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IChain extends Remote{

	//Đảo ngược và in hoa chuỗi
	public  String DaoNguoc(String st) throws RemoteException;

	//Đếm số lượng các từ trong chuỗi
	public 	int DemTu(String st) throws RemoteException;

	//Đếm số lần xuất hiện của các ký tự hoa trong chuỗi
	public  int DemSoKyTuHoa(String st) throws RemoteException;

	//Chuyển ký tự đầu sau dấu cách thành in hoa
	public  String ChuHoaDau(String st) throws RemoteException;

	//Thay thể ký tự trong chuỗi
	public  String ThayTheKyTu(String st, char kTim, char kThayThe) throws RemoteException;

	//Đếm số lượng ký tự trong chuỗi
	public  int DemSoKyTu(String st) throws RemoteException;
	
}

