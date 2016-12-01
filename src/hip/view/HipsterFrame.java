package hip.view;

import hip.controller.HipController;

import java.awt.Dimension;

import javax.swing.JFrame;

public class HipsterFrame extends JFrame
{
	private HipController controller;
	private HipsterPanel hipPanel;
	
	public HipsterFrame(HipController controller){
		super();
		this.controller = controller;
		hipPanel = new HipsterPanel(controller);
		setupFrame();
	}

	private void setupFrame() 
	{
		this.setContentPane(hipPanel);
		this.setTitle("HipTitle");
		this.setSize(new Dimension(500,500));
		this.setVisible(true);
		
	}

}
