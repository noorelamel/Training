package greetings;

import printing.IMachine;
import printing.Machine;
import printing.Printer;

public class HelloWorld {

	public static void main(String[] args)
	{
		IMachine machine = new Printer(true, "MY PRINTER");
		//Machine machine = new Machine(false);
		
		machine.TurnOn();
				
	}
}
