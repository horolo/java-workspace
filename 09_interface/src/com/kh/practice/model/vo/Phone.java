package com.kh.practice.model.vo;

public interface Phone {
	//필드 부 - 인터페이스 내부 필드는 무조건 static final(생략가능)
	public static final char[] NUMBERPAD 
	= {'1', '2', '3', '4', '5', '6', '7', '8','9', '*', '0', '#'};
	
	//생성자 부 - 인터페이스는 실체화가 불가능하기 때문에 생성자를 가질 수 없다.
	//메소드 부 - 인터페이스 내부 메소드는 무조건 추상 메소드(abstract) : public abstract 생략가능
	public abstract String makeCall();	//전화 걸기
	public abstract String takeCall();	//전화 받기
	
}
