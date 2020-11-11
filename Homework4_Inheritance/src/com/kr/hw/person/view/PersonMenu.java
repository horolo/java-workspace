package com.kr.hw.person.view;

import java.util.Arrays;
import java.util.Scanner;

import com.kr.hw.person.controller.PersonController;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	public void mainMenu() { //���θ޴� ���
		//����� �л��� ��� ���� �˷��ִ� ��, personCount�޼ҵ� ��ȯ���� �̿��ؼ� ���
		System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.");
		System.out.println("���� ����� �л��� "+pc.personCount()+"�Դϴ�.");
		while(true) {
			System.out.println("1. �л� �޴�");
			System.out.println("2. ��� �޴�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ: ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("�����մϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				break;
			}
			
		}
	}
	public void studentMenu() { //�л��޴� ���
		
			System.out.println("1. �л� �߰�");
			System.out.println("2. �л� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ: ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				insertStudent();
				break;
			case 2:
				printStudent();
				break;
			case 9:
				System.out.println("�������� ���ư��ϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				break;
			}
		}	
	public void employeeMenu() { //����޴� ���

			System.out.println("1. ��� �߰�");
			System.out.println("2. ��� ����");
			System.out.println("9. ��������");
			System.out.print("�޴� ��ȣ: ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				insertEmployee();
				break;
			case 2:
				printEmployee();
				break;
			case 9:
				System.out.println("�������� ���ư��ϴ�.");
				return;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				break;
			}
		}	
	public void insertStudent() { //����ڿ��� ��ü�迭�� ������ �л� ������ �޴� �޼ҵ�
		System.out.print("�л� �̸�: ");
		String name = sc.next();
		System.out.print("�л� ����: ");
		int age = sc.nextInt();
		System.out.print("�л� Ű: ");
  		double height = sc.nextDouble();
		System.out.print("�л� ������: ");
		double weight = sc.nextDouble();
		System.out.print("�л� �г�: ");
		int grade = sc.nextInt();
		System.out.print("�л� ����: ");
		String major = sc.next();
		pc.insertStudent(name, age, height, weight, grade, major);
		
	}
	public void printStudent() { //��ü�迭�� ����� �л� �����͸� ����ϴ� �޼ҵ�
		
		
	}
	public void insertEmployee() { //��ü�迭�� ����� ��� �����͸� �޴� �޼ҵ�
		
	}
	public void printEmployee() { //��ü�迭�� ����� ��� �����͸� ����ϴ� �޼ҵ�
		
	}
}
