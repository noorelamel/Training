package converter;

import javax.ejb.EJB;

public class Client {
	@EJB
	public static void main(String[] args) {
		Converter converter = new Converter();
		System.out.println(converter.conversion(100));
	}
}
