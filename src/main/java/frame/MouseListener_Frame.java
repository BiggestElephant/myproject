package frame;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

public class MouseListener_Frame {
	public static void main(String[] args) {
		Frame f=new Frame("测试点击关闭事件"); 
		f.setSize(400,400);
		f.setLocation(0, 0);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		JButton btn=new JButton("按钮");
		f.add(btn);
		btn.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				System.exit(0);
			}
			
		});
		f.setVisible(true);
		
	}
}
