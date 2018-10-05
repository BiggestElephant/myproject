package gui;

import javax.swing.JFrame;

public class Window1 extends JFrame{
MyPanel mp=new MyPanel();
	public static void main(String[] args) {
		
		new Window1();
		
		
	}
	public Window1() {
		init();
	}
	public void init() {
		this.setSize(700,500);
		this.setTitle("ÎÒÊÇ´°¿Ú");
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(mp);
	}

}
