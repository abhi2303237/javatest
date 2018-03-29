package javatest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UserInterface extends JFrame{
	
	private JTextField field;
	private JLabel label;
	private JButton push;
	private JButton pop;
	private JButton dis;
	
	
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

	public void setPush(Stack stc,UserInterface ui) {
		this.push.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(ui.field.getText());
				stc.push(a);
				ui.field.setText(null);
			}
			
		});
	}


	public void setPop(Stack stc,UserInterface ui) {
		this.push.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				int a = stc.pop();
				ui.label.setText(Integer.toString(a));
			}
			
		});
	}


	public void setDisp(Stack stc,UserInterface ui) {
		this.push.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				ui.label.setText(stc.show());
			}
			
		});
	}
	
	
	
}
