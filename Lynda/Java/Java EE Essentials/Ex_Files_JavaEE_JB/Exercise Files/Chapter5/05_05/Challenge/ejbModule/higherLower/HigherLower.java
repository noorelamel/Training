package higherLower;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HigherLower
 */
@Stateless
@LocalBean
public class HigherLower {
	
	int number;

    /**
     * Default constructor. 
     */
    public HigherLower() {
    	Random r = new Random();
        number = r.nextInt(100);
    }
    
    public int getInput() throws IOException {
        System.out.println("Enter a number 0-100:");
        return Integer.parseInt(System.console().readLine());
    }
    
    public void checkValue(int value) {
    	if(value == number) {
    		System.out.println("Winner!");
    	}
    	if(value < number) {
    		System.out.println("Higher");
    	} else if(value > number) {
    		System.out.println("Lower");
    	}
    }

}
