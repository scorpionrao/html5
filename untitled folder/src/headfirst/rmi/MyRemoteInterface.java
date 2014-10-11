package headfirst.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Client's every RMI to stub is risky !
 * 
 * @author rgonugunta
 *
 */
public interface MyRemoteInterface extends Remote {
	public String sayHello() throws RemoteException;

}
