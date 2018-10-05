package gui;
import java.awt.Graphics;

import javax.swing.*;
public class MyPanel extends JPanel{

	public void paint(Graphics g) {
		g.drawString("I am JPanel", 100, 200);
		g.drawLine(20, 20, 500, 200);
		
	}
	
}
