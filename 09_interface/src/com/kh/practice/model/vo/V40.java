package com.kh.practice.model.vo;

public class V40 extends SmartPhone implements NotePen{
	//필드
	
	//생성자
	public V40() {
		setMaker("LG");
	}

	//메소드
	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return "번호를 누르고 통하버튼을 누름";
	}

	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return "수신버튼을 누름";
	}

	@Override
	public String picture() {
		// TODO Auto-generated method stub
		return "1200, 1600만 화소 트리플 카메라";
	}
	
	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return "고속 충전, 고속 무선 충전";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "정전식";
	}

	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String printInformation() {
		String tmp = "V40은"+getMaker()+"에서 만들어졌고 제원은 다음과 같다.\n";
		tmp += makeCall()+"\n";
		tmp += takeCall()+"\n";
		tmp += picture()+"\n";
		tmp += charge()+"\n";
		tmp += touch()+"\n";
		tmp += "블루투스 펜 탑재 여부 : "+bluetoothPen();
		return tmp;
	}
}
