package javatest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Index {
	
	public static void main(String args []) {
		
//		Thread t1 = new Thread(new Me("Executed by t1"));
//		Thread t2 = new Thread(new Me("Executed by t2"));
//		Thread t3 = new Thread(new Me("Executed by t3"));
//		Thread t4 = new Thread(new Me("Executed by t4"));
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
		
		UserInterface ui = new UserInterface("Stack And Operations");
		Stack stack = new Stack();
		
		ui.push.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(ui.field.getText());
				stack.push(a);
				ui.field.setText(null);
			}
			
		});
		
		ui.pop.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				int a = stack.pop();
				ui.label.setText(Integer.toString(a));
			}
			
		});
		
		ui.dis.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				ui.label.setText(stack.show());
			}
			
		});
		
		
	}

}
