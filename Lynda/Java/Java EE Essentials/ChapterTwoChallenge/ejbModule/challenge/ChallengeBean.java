package challenge;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJBException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;
import javax.ejb.LocalBean;
import javax.ejb.RemoveException;
import javax.ejb.Stateless;

import sun.management.FileSystem;

/**
 * Session Bean implementation class ChallengeBean
 */
public class ChallengeBean implements EntityBean{

	private List<String> data;
	
    /**
     * Default constructor. 
     */
    public ChallengeBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejbLoad() throws EJBException, RemoteException {
		Path p = FileSystems.getDefault().getPath("Datasource.txt");
		Charset c = Charset.defaultCharset();
		try{
			data = Files.readAllLines(p, c);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
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
		Path p = FileSystems.getDefault().getPath("Datasource.txt");
		Charset c = Charset.defaultCharset();
		try{
			Files.write(p, data, c);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
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
	
	public void modifyData(int line, String newData){
		data.set(line, newData);
	}

}
