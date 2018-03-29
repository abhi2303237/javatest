package javatest;

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
		
		ui.setPush(stack, ui);
		
		ui.setPop(stack, ui);
		
		ui.setDisp(stack, ui);
		
		
	}

}
