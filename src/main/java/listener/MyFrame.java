package listener;
import javax.swing.*;
public class MyFrame extends JFrame{

	public static void main(String[] args) {
			new MyFrame();
	}
	public MyFrame() {
		this.setVisible(true);
		this.setSize(399, 300);
		this.setTitle("�м�����");
		this.setLocationRelativeTo(null);
		
		MyListener li=new MyListener();
		this.addWindowListener(li);
		
	}

}
