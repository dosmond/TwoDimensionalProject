package two.dimensions.view;

import java.awt.Color;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import two.dimensions.controller.KeyboardController;

public class KeyboardPanel extends JPanel
{
	
	private KeyboardController baseController;
	private JTable keyboardTable;
	private SpringLayout baseLayout;
	private JLabel titleLabel;
	
	public KeyboardPanel(KeyboardController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		titleLabel = new JLabel("Keyboard Central");
		
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupTable()
	{
		String[] colNames = {"Keyboard Col 1", "Keyboard Col 2"};
		DefaultTableModel keyboardModel = new DefaultTableModel(baseController.getMyKeyboards(), colNames);
		keyboardTable = new JTable(keyboardModel);
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(keyboardTable);
		this.add(titleLabel);
		this.setBackground(Color.GRAY);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, keyboardTable, 120, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, keyboardTable, 138, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 179, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, titleLabel, -201, SpringLayout.SOUTH, this);
	}
	
	private void setupListeners()
	{
		
	}

}
