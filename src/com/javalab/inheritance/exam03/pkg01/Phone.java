package com.javalab.inheritance.exam03.pkg01;

// 부모 클래스

public class Phone extends Object {
	
	// 필드 선언
	public String model;
	public String color;
	
	public Phone() {
		super(); // 최고 조상 오브젝트 상속
	}
	
	// 생성자 선언
	public Phone(String model , String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	// phoneInfo() 메소드 구현
	public void phoneInfo() {
		System.out.println("[Phone Info]");
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
	}
	

}
