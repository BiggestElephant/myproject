package listener;

import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class MyFrame02 extends JFrame{

	public static void main(String[] args) {
			new MyFrame02();
	}
	public MyFrame02() {
		init();
	}
	public void init() {
		this.setVisible(true);
		this.setSize(400,400);
		this.setLocationRelativeTo(null);
		this.addWindowListener(new MyListener01());
	}
class MyListener01 extends MyAdapter{

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	
		System.out.println("closed");
	}

	
	
}
	
	
}
