package converter;

import javax.ejb.EJBHome;

public interface HomeInterface extends EJBHome {

	public Converter create();
}
