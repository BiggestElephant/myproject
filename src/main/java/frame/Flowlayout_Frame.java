package frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Flowlayout_Frame {
	public static void main(String[] args) {
		Frame f=new Frame("FlowLayout");
		f.setSize(200, 300);
		f.setLocation(0, 0);
		/*流式布局管理器*/
		f.setLayout(new FlowLayout());
		for(int i=0;i<5;i++) {
			f.add(new Button());
		}
		f.setVisible(true);
		
	}
}
