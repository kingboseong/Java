package com.ruby.java.ch08.innerClass;
interface Messenger{
	String getMessage();
	void setMessage(String msg);
}
class GalaxyMessenger implements Messenger{
	
		public String getMessage() {
		return "test";
	}
	public void setMessage(String msg) {
		System.out.println("메시지 = " + msg);
	}

}

public class MessengerTest2 {
	
	public static void main(String[] args) {
		GalaxyMessenger galaxy = new GalaxyMessenger();
		Messenger test = new Messenger(){
			public String getMessage() {
				return "test";
			}
			public void setMessage(String msg) {
				System.out.println("메시지 = " + msg);
			}
		}; //여기에 왜 ;을 넣어야 하는가? = 
		
	}
}
