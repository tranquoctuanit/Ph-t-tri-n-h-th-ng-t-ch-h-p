package baitap;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IChain extends Remote{
	
	public  String DaoNguoc(String st) throws RemoteException;
	public 	int DemTu(String st) throws RemoteException;
	
}

