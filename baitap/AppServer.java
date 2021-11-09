package baitap;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class AppServer {
	public static void main(String args[])
	{
		try
		{
			IChain Server = new ChainImpl();
			LocateRegistry.createRegistry(2001);
			Naming.rebind("rmi://localhost:2001/chain" , Server);
			System.out.println("Server waiting.....");
		}
		catch (java.net.MalformedURLException me) {
			System.out.println("Malformed URL: " + me.toString()); }
		catch (RemoteException re) {
			System.out.println("Remote exception: " + re.toString()); }
	}
}

