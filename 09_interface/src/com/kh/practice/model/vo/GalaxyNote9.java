package com.kh.practice.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	//필드
	
	//생성자
	public GalaxyNote9() {
		super.setMaker("삼성"); 	
		/* 부모클래스(SmartPhone) 내부에 있는 maker 필드의 값을 초기화
			-  maker 필드가 private 접근제한자를 가지고 있기 때문에 직접 접근이 불가능
			- 자식 클래스 내부에 setMaker 메소드가 없기 때문에 super. 은 생략 가능*/
	}

	//메소드
	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return "번화를 누르고 통화버튼을 누름";
	}

	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return "수신 버튼을 누름";
	}

	@Override
	public String picture() {
		// TODO Auto-generated method stub
		return "1200만 듀얼 카메라";
	}
	
	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return "고속 충전, 고속 무선 충전";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "정전식, 와콤펜 지원";
	}

	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String printInformation() {
		String tmp = "갤럭시 노트9은"+getMaker()+"에서 만들어졌고 제원은 다음과 같다.\n";
		tmp += makeCall()+"\n";
		tmp += takeCall()+"\n";
		tmp += picture()+"\n";
		tmp += charge()+"\n";
		tmp += touch()+"\n";
		tmp += "블루투스 펜 탑재 여부 : "+bluetoothPen();
		return tmp;
	}
	
}
