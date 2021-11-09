package baitap;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ChainImpl extends UnicastRemoteObject implements IChain{

	private static final long serialVersionUID = 1L;
	public ChainImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	public  String DaoNguoc(String st) throws RemoteException {
		String inhoa = st.toUpperCase();
		StringBuffer result = new StringBuffer(inhoa);
		return result.reverse().toString();
	}

	public int DemTu(String st) throws RemoteException{
		int dem;
		if (st.charAt(0)!=' ')
			dem = 1;
		else
			dem = 0;
		for (int i=0;i<st.length();i++ )
		{
			if (st.charAt(i)==' ' && st.charAt(i+1)!=' ')
			{
				dem++;
			}
		}
		return dem;
	}

}
