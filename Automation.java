package week3.day2;

public class Automation extends MultipleLangauge implements Language, TestTool{

	public void java() 
	{
		System.out.println("java() of Language Interface is implemented in Automation subclass");
	}

	@Override
	void ruby() 
	{
		System.out.println("ruby() of  MultipleLangauge Abstract class is implemented in Automation subclass");
	}
	
	public void selenium() 
	{
		System.out.println("selenium() of  TestTool Interface is implemented in Automation subclass");
	}

	public static void main(String[] args) 
	{
		//create object for Child class 
		Automation automation = new Automation();
		
		//Calling the Abstract class method 
		automation.python();
		
		//Calling Language interface method
		automation.java();
		
		//Calling MultipleLangauge interface method
		automation.ruby();
		
		//Calling TestTool interface method
		automation.selenium();
	}

}
