package greetings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import printing.ColorCartridge;
import printing.Printer;

public class HelloWorld {

	public static void main(String[] args)
	{
		Printer<ColorCartridge> printer  = new Printer<ColorCartridge>(true, "MY PRINTER", ColorCartridge.RED);
		
		printer.loadPaper(5);
		printer.print(3);
		printer.outputPage(1);
		
		Path path = Paths.get("C:\\temp\\newfile.txt");
		
		//Creating a File
		try {
			Files.createFile(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Deleting a File
//		try {
//			Files.deleteIfExists(path);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// Moving a File
		try {
			Files.move(path, Paths.get("C:\\temp\\movedfile.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
