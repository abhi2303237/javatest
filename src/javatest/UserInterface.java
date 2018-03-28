package javatest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserInterface extends JFrame{
	
	public JTextField field;
	public JLabel label;
	public JButton push;
	public JButton pop;
	public JButton dis;
	
	
	UserInterface(String str){
		setTitle(str);
		field = new JTextField(40); 
		label = new JLabel("Hai abhi");
		push = new JButton("Push");
		pop = new JButton("Pop");
		dis = new JButton("Display");
		add(push);
		add(dis);
		add(pop);
		add(field);
        add(label);
        label.setLocation(10, 490);
        this.setSize(500,500);
        setVisible(true);
        setLayout(new FlowLayout());
	}
	
}
