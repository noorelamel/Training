package sampleEntityBean;
import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

import sampleEntityBean.SampleEntityBean;


public interface homeInterface extends EJBHome {

	public SampleEntityBean create() throws CreateException, RemoteException;
}
