package converter;

import java.rmi.RemoteException;

public interface componentInterface extends javax.ejb.EJBLocalObject {

	public double conversion(double Celsius) throws RemoteException;
	
}
