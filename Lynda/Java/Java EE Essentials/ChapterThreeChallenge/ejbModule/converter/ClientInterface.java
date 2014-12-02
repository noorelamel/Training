package converter;

import java.rmi.RemoteException;

public interface ClientInterface extends javax.ejb.EJBLocalObject {

	public double conversion(double celcius) throws RemoteException;
}
