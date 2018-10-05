package frame;

import java.awt.Frame;
import java.awt.Toolkit;

public class Windows_Frame {
	public static void main(String[] args) {
		Frame f=new Frame("我是一个窗口");
		f.setSize(300, 500);
		f.setLocation(0, 0);
		f.setIconImage(Toolkit.getDefaultToolkit().createImage("./img2.jpg"));
		f.setVisible(true);
		
		
	}
}
