package hip.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import hip.controller.HipController;

import javax.swing.*;

public class HipsterPanel extends JPanel 
{
	private static final long serialVersionUID = 2L;
	private SpringLayout baseLayout;
	private JComboBox<String> dropDown;
	private JTextField infoLabel;
	private JButton myButton;
	private HipController controller;
	
	public HipsterPanel(HipController controller)
	{
		
		this.setController(controller);
		this.baseLayout = new SpringLayout();
		this.myButton = new JButton("CLick the button");
		this.infoLabel = new JTextField("Wow words!");
		String[] HipsterNames = new String[controller.getHipsters().length];
		for(int index = 0; index<HipsterNames.length;index++){
			HipsterNames[index] = controller.getHipsters()[index].toString();
		}
		this.dropDown = new JComboBox<String>(HipsterNames);
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.ORANGE);
		this.setLayout(baseLayout);
		this.add(dropDown);
		this.add(infoLabel);
		this.add(myButton);
	}
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, myButton, 115, SpringLayout.SOUTH, dropDown);
		baseLayout.putConstraint(SpringLayout.NORTH, dropDown, 64, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, dropDown, -296, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, dropDown, -147, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, infoLabel, 5, SpringLayout.NORTH, myButton);
		baseLayout.putConstraint(SpringLayout.WEST, infoLabel, 45, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, myButton, -10, SpringLayout.EAST, this);
	}
	private void setupListeners()
	{
		dropDown.addActionListener(
				new ActionListener(){
				public void actionPerformed(ActionEvent selection)
				{
					infoLabel.setText(dropDown.getSelectedItem().toString());
					buttonClicked();
				}});
		
	}

	public HipController getController() {
		return controller;
	}

	public void setController(HipController controller) {
		this.controller = controller;
	}
	private void buttonClicked()
	{
		
		
		
	}

}
