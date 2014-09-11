package printing;

public class Printer 
{
	private boolean isOn;
	private String modelNumber;
	
	public Printer(boolean isOn, String modelNumber)
	{
		this.isOn = isOn;
		this.modelNumber = modelNumber;
	}
	
	public void print(int copies)
	{
		String onStatus = "";
		if(isOn)
			onStatus = " is On!";
		else
			onStatus = " is Off!";
		
		String textToPrint = modelNumber + onStatus;
						
		//for( int i = 0; i < copies; i++ )
		while( copies > 0 )
		{
			System.out.println(textToPrint);
			copies--;
		}		
	}
	
	public void printColors()
	{
		String[] colors = new String[] { "Red", "Blue", "Green", "Yellow", "Orange" };
		
		for( String currentColor : colors )
		{
			if("Green".equals(currentColor))
				continue;
			
			System.out.println(currentColor);
		}
		
	}
	
	private void print(String text)
	{
		System.out.println(text);
	}
	
	public String getModelNumber()
	{
		return modelNumber;
	}
}
