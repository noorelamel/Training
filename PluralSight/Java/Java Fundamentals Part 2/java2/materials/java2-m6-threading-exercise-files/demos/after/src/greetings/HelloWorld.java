package greetings;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import printing.ContinuousPrinter;
import printing.Printer;

public class HelloWorld {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		ContinuousPrinter cp = new ContinuousPrinter();
		//Thread thread = new Thread(cp);
		//thread.start();
		
		ExecutorService executor = Executors.newFixedThreadPool(100);
		executor.submit(cp);
		executor.submit(cp);
		executor.submit(cp);
		executor.submit(cp);
		executor.submit(cp);
		executor.submit(cp);
		executor.shutdown();
		
		for(int i = 0; i < 100; i++)
			System.out.println("Main thread " + i);
		
	}
	
	
}

