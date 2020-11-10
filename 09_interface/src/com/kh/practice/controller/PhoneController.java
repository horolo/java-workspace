package com.kh.practice.controller;

import com.kh.practice.model.vo.GalaxyNote9;
import com.kh.practice.model.vo.Phone;
import com.kh.practice.model.vo.SmartPhone;
import com.kh.practice.model.vo.V40;

public class PhoneController {
	//�ʵ�
	private String[] result = new String[2];
	
	//������
	
	//�޼ҵ�
	public String[] method() {
		Phone[] ph = new Phone[2];	//2���� Phone ��ü�� ������ �� �ִ� ��ü�迭 ����
		ph[0] = new GalaxyNote9();	//������ �ε����� �������� �����Ͽ� GalaxyNote9 ��ü ����
		ph[1] = new V40();			//������ �ε����� �������� �����Ͽ� V40 ��ü ����
		
		/*	�θ� ���� ������ �ڽ� ��ü�� ���� ���
		 *  - �θ� ���� ������ �̿��ؼ��� �ڽ� ��ü���� ������ ����� ���� �Ұ��� 
		 *  - �ٿ� ĳ������ ���ؼ� ���� ����
		 */
//		//��üȭ�� ��ü�� �ٿ�ĳ����
//		((GalaxyNote9)ph[0]).printInformation();
//		((V40)ph[1]).printInformation();
//		//�ش� ����� ����� �θ� Ŭ������ �ٿ�ĳ����
//		((SmartPhone)ph[0]).printInformation();
//		((SmartPhone)ph[1]).printInformation();
		for(int i = 0; i<ph.length; i++) {
			//���1
			//result[i] = ((SmartPhone)ph[i]).printInformation();
			if(ph[i] instanceof GalaxyNote9) {
				result[i] = ((GalaxyNote9)ph[i]).printInformation();
			}else if(ph[i] instanceof V40) {
				result[i] = ((V40)ph[i]).printInformation();
			}
		}
		
		return result;
	}
}
