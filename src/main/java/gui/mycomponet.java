package gui;

import javax.swing.*;

public class mycomponet {

	public static void main(String[] args) {
			
		new myJFrame();
		
	}

}
class myJFrame extends JFrame {
	private JPanel panel=new JPanel();
	private JLabel label=new JLabel("��ʾ��Ϣ");//��ʾ��Ϣ�������Ϣ
	private JTextField text=new JTextField("                      ");//�ı���
	private JButton button=new JButton("��ť");
	
	private ButtonGroup bg=new ButtonGroup();
	private JRadioButton radio1=new JRadioButton("��");//��ѡ��ť
	private JRadioButton radio2=new JRadioButton("Ů");
	
	private JCheckBox cb1=new JCheckBox("1");//��ѡ��
	private JCheckBox cb2=new JCheckBox("2");
	private JCheckBox cb3=new JCheckBox("3");
	
	String name[]= {"������","��¶","����","ŶiΪ"};
	private JComboBox jcb=new JComboBox(name);//�����򣻿��Դ������飻
	
	
	public myJFrame() {
		init();
	}
	
	public void init() {
		this.setTitle("GUI�������");
		this.setSize(400, 500);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		bg.add(radio1);
		bg.add(radio2);
		
		panel.add(label);
		panel.add(text);
		panel.add(button);
		panel.add(radio1);
		panel.add(radio2);
		panel.add(cb1);
		panel.add(cb2);
		panel.add(cb3);
		panel.add(jcb); 
		this.add(panel);
		
		
	}
	
	
}





















