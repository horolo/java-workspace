package com.kh.practice.model.vo;

public class V40 extends SmartPhone implements NotePen{
	//�ʵ�
	
	//������
	public V40() {
		setMaker("LG");
	}

	//�޼ҵ�
	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return "��ȣ�� ������ ���Ϲ�ư�� ����";
	}

	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return "���Ź�ư�� ����";
	}

	@Override
	public String picture() {
		// TODO Auto-generated method stub
		return "1200, 1600�� ȭ�� Ʈ���� ī�޶�";
	}
	
	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return "��� ����, ��� ���� ����";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "������";
	}

	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String printInformation() {
		String tmp = "V40��"+getMaker()+"���� ��������� ������ ������ ����.\n";
		tmp += makeCall()+"\n";
		tmp += takeCall()+"\n";
		tmp += picture()+"\n";
		tmp += charge()+"\n";
		tmp += touch()+"\n";
		tmp += "������� �� ž�� ���� : "+bluetoothPen();
		return tmp;
	}
}
