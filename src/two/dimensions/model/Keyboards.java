package two.dimensions.model;

public class Keyboards
{
	private String name;
	private String typeOfKeys;
	private double price;
	
	public String toString()
	{
		String keyboardString = "";
		
		keyboardString += "Hi, I am a keyboard. More specifically, I am a " + name + ".";
		keyboardString += " I have " + typeOfKeys + " and ";
		keyboardString += "I cost $" + price + ".";
		
		return keyboardString;
	}
	
	public Keyboards(String name, String typeOfKeys, double price)
	{
		this.name = name;
		this.typeOfKeys = typeOfKeys;
		this.price = price;
	}
}
