package two.dimensions.controller;

import javax.swing.JOptionPane;

import two.dimensions.model.Keyboards;
import two.dimensions.view.KeyboardFrame;

public class KeyboardController
{
	private Keyboards[][] myKeyboards;
	
	private KeyboardFrame appFrame;
	
	public KeyboardController()
	{
		myKeyboards = new Keyboards[3][2];
		fillMyKeyboardArray();
		appFrame = new KeyboardFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "Welcome to my keyboard app");
	}
	
	private void fillMyKeyboardArray()
	{
		for(int row = 0; row < myKeyboards.length; row++)
		{
			for(int col = myKeyboards[row].length-1; col >= 0; col--)
			{
				String name = row + col + "Keyboard";
				String typeOfKeys = (int) (Math.random() * 10) + " Keys";
				int price = (int) (Math.random() * 10000);
				myKeyboards[row][col] = new Keyboards(name, typeOfKeys, price);
			}
		}
	}
	
	
	public Keyboards[][] getMyKeyboards()
	{
		return myKeyboards;
	}
	
	public KeyboardFrame getAppFrame()
	{
		return appFrame;
	}
	
}
