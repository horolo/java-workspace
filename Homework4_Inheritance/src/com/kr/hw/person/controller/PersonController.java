package com.kr.hw.person.controller;

import com.kr.hw.person.model.vo.Employee;
import com.kr.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3]; // Student 형태의 s 참조변수 배열 선언
	private Employee[] e = new Employee[10];
	int count = 0;
	
	public int[] personCount() {
		int[] tmp;
		return null;
	}
	public void insertStudent(String name, int age, double height, double weight,
			int grade, String major) {
			s[count] = new Student(name, age, height, weight, grade, major);
			count++;
	}
	public Student[] printStudent() {
		return s;
	}
	public void insertEmployee(String name, int age, double height, double weight,
			int salary, String dept) {
		
	}
	public Employee[] printEmployee() {
		return e;
	}
	
}
