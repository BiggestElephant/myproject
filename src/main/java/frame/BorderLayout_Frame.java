package frame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayout_Frame {
	public static void main(String[] args) {
		Frame f=new Frame("BorderLayout");
		Button bn=new Button("BNORTH");
		Button be=new Button("BEAST");
		Button bw=new Button("BWEST");
		Button bs=new Button("BSOUTH");
		Button bc=new Button("BCENTER");
		/*边界布局管理器*/
		f.setLayout(new BorderLayout());
		f.add(bs, BorderLayout.SOUTH);
		f.add(bw, BorderLayout.WEST);
		f.add(be, BorderLayout.EAST);
		f.add(bn, BorderLayout.NORTH);
		f.add(bc, BorderLayout.CENTER);
		
		f.setSize(500, 500);
		
		f.setVisible(true);
	}
}
