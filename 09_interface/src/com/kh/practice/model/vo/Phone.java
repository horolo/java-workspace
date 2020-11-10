package com.kh.practice.model.vo;

public interface Phone {
	//�ʵ� �� - �������̽� ���� �ʵ�� ������ static final(��������)
	public static final char[] NUMBERPAD 
	= {'1', '2', '3', '4', '5', '6', '7', '8','9', '*', '0', '#'};
	
	//������ �� - �������̽��� ��üȭ�� �Ұ����ϱ� ������ �����ڸ� ���� �� ����.
	//�޼ҵ� �� - �������̽� ���� �޼ҵ�� ������ �߻� �޼ҵ�(abstract) : public abstract ��������
	public abstract String makeCall();	//��ȭ �ɱ�
	public abstract String takeCall();	//��ȭ �ޱ�
	
}
