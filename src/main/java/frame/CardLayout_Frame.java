package frame;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayout_Frame {
	public static void main(String[] args) {
		Frame f=new Frame("这是一个串口");
		f.setSize(300,400);
		f.setLocation(0, 0);
		f.setLayout(new FlowLayout());
		f.addWindowListener(new WindowAdapter(){//适配器
			
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);
		
		
	}
}
