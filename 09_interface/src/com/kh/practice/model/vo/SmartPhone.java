package com.kh.practice.model.vo;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	//�ʵ��
	private String maker;	//������ ����
	
	//�����ں�
	public SmartPhone() {
		
	}
	
	//�޼ҵ��
	public abstract String printInformation();
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getMaker() {
		return maker;
	}
}
