package sampleEntityBean;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;
import javax.ejb.LocalBean;
import javax.ejb.RemoveException;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class SampleEntityBean
 */

public class SampleEntityBean implements EntityBean {

    /**
     * Default constructor. 
     */
    public SampleEntityBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbLoad() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbRemove() throws RemoveException, EJBException,
			RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbStore() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEntityContext(EntityContext arg0) throws EJBException,
			RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unsetEntityContext() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

}
