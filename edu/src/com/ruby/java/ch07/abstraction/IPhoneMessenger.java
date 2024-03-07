package com.ruby.java.ch07.abstraction;

public class IPhoneMessenger implements Messenger {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void clearMessage() {
		System.out.println("좌우로 흔들어 문자열을 지웁니다.");
	}
	
	
}
