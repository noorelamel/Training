package greetings;

import java.io.File;
import java.io.IOException;

import printing.BWCartridge;
import printing.ColorCartridge;
import printing.ICartridge;
import printing.Printer;

public class HelloWorld {

	public static void main(String[] args)
	{
		Printer<BWCartridge> printer  = new Printer<BWCartridge>(true, "MY PRINTER", new BWCartridge());
		
		File file = new File("C:\\test.txt");
		try 
		{
			file.createNewFile();
		} 
		catch (IOException e) {
			
			
		}
			
		
		try
		{
			printer.print(-1);
		}
		catch (IllegalArgumentException exception)
		{
			System.out.println(exception.getMessage());
			return;
		}
		finally
		{
			printer.TurnOff();
		}
		
	}
}
