
public class BarChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = {0,0,0,0,0,0,1,2,4,2,1};
		
		System.out.print("Grade distribution:");
		
		// for each array element, output a bar of the chart
		for(int index = 0; index < array.length; index++){
			// output bar label
			if(index == 10){
				System.out.printf("%5d", 100);
			}
			else{
				System.out.printf("%02d-%02d: ", index * 10, index * 10 + 9);
			}// end of if/else
			
			for(int stars = 0; stars < array[index]; stars++){
				System.out.print("*");
			}
			System.out.println();
		}// end of outer for

	}// end of main

}
