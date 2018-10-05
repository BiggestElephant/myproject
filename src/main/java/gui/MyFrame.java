package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	
	JPanel jp=new JPanel();
	public static void main(String[] args) {
		new MyFrame();
	}
	public MyFrame() {
		this.setTitle("windows");//…Ë÷√±ÍÃ‚
		this.setSize(400, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.add(jp);
		
	}
	
}
