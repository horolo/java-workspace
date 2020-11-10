package com.kh.practice.model.vo;

public interface CellPhone extends Phone, Camera{ //인터페이스에 한해 다중 상속 가능
	public abstract String charge();	//충전 방식
}
