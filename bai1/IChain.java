package bai1;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IChain extends Remote{

	public  String DaoNguoc(String st) throws RemoteException;
	public 	int DemTu(String st) throws RemoteException;
	public  int DemSoKyTuHoa(String st) throws RemoteException;
	public  String ChuHoaDau(String st) throws RemoteException;
	public  String ThayTheKyTu(String st, char kTim, char kThayThe) throws RemoteException;
	public  int DemSoKyTu(String st) throws RemoteException;
	public  int DemKyTu(String st, char kTu) throws RemoteException;
	
}

