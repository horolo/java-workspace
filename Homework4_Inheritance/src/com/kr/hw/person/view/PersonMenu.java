package com.kr.hw.person.view;

import java.util.Arrays;
import java.util.Scanner;

import com.kr.hw.person.controller.PersonController;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	public void mainMenu() { //메인메뉴 출력
		//저장된 학생과 사원 숫자 알려주는 곳, personCount메소드 반환값을 이용해서 출력
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 "+pc.personCount()+"입니다.");
		while(true) {
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호: ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
			
		}
	}
	public void studentMenu() { //학생메뉴 출력
		
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호: ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				insertStudent();
				break;
			case 2:
				printStudent();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}	
	public void employeeMenu() { //사원메뉴 출력

			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호: ");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				insertEmployee();
				break;
			case 2:
				printEmployee();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}	
	public void insertStudent() { //사용자에게 객체배열에 저장할 학생 데이터 받는 메소드
		System.out.print("학생 이름: ");
		String name = sc.next();
		System.out.print("학생 나이: ");
		int age = sc.nextInt();
		System.out.print("학생 키: ");
  		double height = sc.nextDouble();
		System.out.print("학생 몸무게: ");
		double weight = sc.nextDouble();
		System.out.print("학생 학년: ");
		int grade = sc.nextInt();
		System.out.print("학생 전공: ");
		String major = sc.next();
		pc.insertStudent(name, age, height, weight, grade, major);
		
	}
	public void printStudent() { //객체배열에 저장된 학생 데이터를 출력하는 메소드
		
		
	}
	public void insertEmployee() { //객체배열에 저장된 사원 데이터를 받는 메소드
		
	}
	public void printEmployee() { //객체배열에 저장된 사원 데이터를 출력하는 메소드
		
	}
}
