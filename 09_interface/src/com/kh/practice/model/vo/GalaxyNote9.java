package com.kh.practice.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	//�ʵ�
	
	//������
	public GalaxyNote9() {
		super.setMaker("�Ｚ"); 	
		/* �θ�Ŭ����(SmartPhone) ���ο� �ִ� maker �ʵ��� ���� �ʱ�ȭ
			-  maker �ʵ尡 private ���������ڸ� ������ �ֱ� ������ ���� ������ �Ұ���
			- �ڽ� Ŭ���� ���ο� setMaker �޼ҵ尡 ���� ������ super. �� ���� ����*/
	}

	//�޼ҵ�
	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return "��ȭ�� ������ ��ȭ��ư�� ����";
	}

	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return "���� ��ư�� ����";
	}

	@Override
	public String picture() {
		// TODO Auto-generated method stub
		return "1200�� ��� ī�޶�";
	}
	
	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return "��� ����, ��� ���� ����";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return "������, ������ ����";
	}

	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String printInformation() {
		String tmp = "������ ��Ʈ9��"+getMaker()+"���� ��������� ������ ������ ����.\n";
		tmp += makeCall()+"\n";
		tmp += takeCall()+"\n";
		tmp += picture()+"\n";
		tmp += charge()+"\n";
		tmp += touch()+"\n";
		tmp += "������� �� ž�� ���� : "+bluetoothPen();
		return tmp;
	}
	
}
