package listener;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CardLayoutTest extends JFrame{
	private JPanel ptn=null;//�Ű�ť�����
	private JPanel panel=null;//���������
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
		//�ɰ�ť������壻
		ptn.add(next);ptn.add(pre);
		
		p1=new JPanel();p2=new JPanel();p3=new JPanel();panel=new JPanel();
		p1.setBackground(Color.BLUE);p2.setBackground(Color.BLACK);p3.setBackground(Color.GRAY);
		layout=new CardLayout();
		panel.setLayout(layout);//��װ����������ò��֣�
		panel.add(p1);panel.add(p2);panel.add(p3);//�����װ����壻��Ϊ��Ƭʽ����Ϊ�����ʾ��
		
		this.setSize(500,500);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());//�������������ò���Ϊ�߿򲼾֣�
		this.add(ptn,"South");//����Ű�ť����壬���������棻
		this.add(panel);//�����������壻�����Ϊ��Ƭʽ���֣�
		
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














