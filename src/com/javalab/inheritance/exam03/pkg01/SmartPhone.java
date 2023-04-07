package com.javalab.inheritance.exam03.pkg01;

public class SmartPhone extends Phone {
	
	// 필드
	public String frequency;
	
	// 생성자
	public SmartPhone() {
		super(); // 부모의 기본생성자 호출 
	}
	
	public SmartPhone(String model, String color) {
		super(model, color);
	}

	public SmartPhone(String model, String color, String frequency) {
		super(model, color);
		this.frequency = frequency;
	}
	
	
	public void showSmartPhoneInfo() {
		this.phoneInfo();
		System.out.println("[ShowSmartPhone Info]");
		System.out.println("frequency : " + this.frequency);
	}

}
