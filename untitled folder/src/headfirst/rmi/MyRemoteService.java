package headfirst.rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteService extends UnicastRemoteObject 
	implements MyRemoteInterface {
	
	public MyRemoteService() throws RemoteException { }
	
	public String sayHello() {
		return "Server says, 'Hey'";
	}
	
	public static void main(String[] args) {
		try {
			MyRemoteInterface service = new MyRemoteService();
			Naming.rebind("RemoteHello", service);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}