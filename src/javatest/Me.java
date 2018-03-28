package javatest;


public class Me implements Runnable{
	public String str;
	static int count=0;
	
	 Me(String string) {
		count++;
		this.str=string+"\n And the total No of OBJ : "+count;
	}

	public void run(){
		
		new UserInterface(str);
	}
}