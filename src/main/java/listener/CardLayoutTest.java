package listener;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CardLayoutTest extends JFrame{
	private JPanel ptn=null;//放按钮的面板
	private JPanel panel=null;//放面板的面板
	private CardLayout layout=null;
	
	private JButton next=null;
	private JButton pre=null;
	
	private JPanel p1=null;
	private JPanel p2=null;
	private JPanel p3=null;
	public static void main(String[] args) {
		new CardLayoutTest();
	}
	public CardLayoutTest() {
		next=new JButton("next");
		pre=new JButton("pre");
		
		ptn=new JPanel();
		//吧按钮放入面板；
		ptn.add(next);ptn.add(pre);
		
		p1=new JPanel();p2=new JPanel();p3=new JPanel();panel=new JPanel();
		p1.setBackground(Color.BLUE);p2.setBackground(Color.BLACK);p3.setBackground(Color.GRAY);
		layout=new CardLayout();
		panel.setLayout(layout);//给装面板的面板设置布局；
		panel.add(p1);panel.add(p2);panel.add(p3);//把面板装入面板；因为卡片式布局为层叠显示；
		
		this.setSize(500,500);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());//给整个窗口设置布局为边框布局；
		this.add(ptn,"South");//加入放按钮的面板，放在最下面；
		this.add(panel);//加入放面板的面板；该面板为卡片式布局；
		
		pre.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
					layout.previous(panel);
			}
			
			
		});
		next.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
					layout.next(panel);
			}
			
		});
		
		
	}

}














