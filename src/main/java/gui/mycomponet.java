package gui;

import javax.swing.*;

public class mycomponet {

	public static void main(String[] args) {
			
		new myJFrame();
		
	}

}
class myJFrame extends JFrame {
	private JPanel panel=new JPanel();
	private JLabel label=new JLabel("显示信息");//显示信息，标记信息
	private JTextField text=new JTextField("                      ");//文本框
	private JButton button=new JButton("按钮");
	
	private ButtonGroup bg=new ButtonGroup();
	private JRadioButton radio1=new JRadioButton("男");//单选按钮
	private JRadioButton radio2=new JRadioButton("女");
	
	private JCheckBox cb1=new JCheckBox("1");//复选框
	private JCheckBox cb2=new JCheckBox("2");
	private JCheckBox cb3=new JCheckBox("3");
	
	String name[]= {"张叔叔","流露","韩寒","哦i为"};
	private JComboBox jcb=new JComboBox(name);//下拉框；可以传入数组；
	
	
	public myJFrame() {
		init();
	}
	
	public void init() {
		this.setTitle("GUI常用组件");
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





















