package converter;

import javax.ejb.EJBHome;

public interface homeInterface extends EJBHome {

	public Converter create();
}
