package challenge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.RemoteException;

import javax.ejb.ConcurrencyManagement;
import javax.ejb.EJBException;
import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Solution
 */
@Stateless
@LocalBean
public class Solution implements SessionBean {

    /**
     * Default constructor. 
     */
    public Solution() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbRemove() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSessionContext(SessionContext arg0) throws EJBException,
			RemoteException {
		// TODO Auto-generated method stub
		
	}
	
	public int get() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("/data.txt"));
			String value = reader.readLine();
			return Integer.parseInt(value);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Lock(WRITE)
	public void addOne() {
		int value = get();
		PrintWriter writer = new PrintWriter(new FileWriter("/data.txt"));
		writer.write(value+1);
	}
}
