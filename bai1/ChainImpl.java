package bai1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ChainImpl extends UnicastRemoteObject implements IChain{

	private static final long serialVersionUID = 1L;
	public ChainImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	//Đảo ngược và in hoa chuỗi
	public  String DaoNguoc(String st) throws RemoteException {
		String inhoa = st.toUpperCase();
		StringBuffer result = new StringBuffer(inhoa);
		return result.reverse().toString();
	}

	//Đếm số lượng các từ trong chuỗi
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

	//Đếm số lần xuất hiện của các ký tự hoa trong chuỗi
	public  int DemSoKyTuHoa(String st) throws RemoteException {

		int dem = 0;
		for (int i=0;i<st.length();i++)
			if ((st.charAt(i)<='A') || (st.charAt(i)<='Z'))
				dem++;
		return dem;

	}
	
	//Chuyển ký tự đầu sau dấu cách thành in hoa
	public  String ChuHoaDau(String st) throws RemoteException{
		if (st.charAt(0)!=' ')
		{
			st = st.substring(0,1).toUpperCase().concat(st.substring(1));
		}
		for (int i=0;i<st.length() ;i++ )
			if (st.charAt(i)==' ')
			{
				int vt = i+1;
				String st1 = st.substring(0,vt);
				String st2 = st.substring(vt,vt+1).toUpperCase();
				String st3 = st.substring(vt+1);
				st = st1.concat(st2.concat(st3));
			}
		return st;
	}
	
	//Thay thể ký tự trong chuỗi
	public  String ThayTheKyTu(String st, char kTim, char kThayThe) throws RemoteException{
		st = st.replace(kTim,kThayThe);
		return st;

	}
	
	//Đếm số lượng ký tự trong chuỗi
	public  int DemSoKyTu(String st) throws RemoteException{

		int dem = 0;
		for (int i=0;i<st.length();i++)
			if ((st.charAt(i)<='a') || (st.charAt(i)<='z') || (st.charAt(i)<='A') || (st.charAt(i)<='Z'))
				
				dem++;
				
		return dem;

	}
}
