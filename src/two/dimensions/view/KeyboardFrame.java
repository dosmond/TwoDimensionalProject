package two.dimensions.view;

import javax.swing.JFrame;

import two.dimensions.controller.KeyboardController;

public class KeyboardFrame extends JFrame
{
	private KeyboardPanel appPanel;
	
	public KeyboardFrame(KeyboardController baseController)
	{
		appPanel = new KeyboardPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(500,500);
		this.setContentPane(appPanel);
		this.setVisible(true);
	}
	
}
