package com.javalab.inheritance.exam01;

public class Child extends Parent{
	
	public String address;
	public String phone;
	
	// 기본 생성자
	public Child() {
		super();		// 첫줄에서 부모 객체 기본 생성자 호출
	}
	
	public Child(String address) {
		super("김길동" , 29); // 부모 필드 초기화 !반드시 첫줄에 작성!
		this.address = address; // 본인 필드 초기화
		System.out.println("자식 객체의 생성자1");
	}
	
	public Child(String address , String phone) {
		// super(); 생략
		this.address = address;
		this.phone = phone;
		System.out.println("자식 객체의 생성자2");
	}

}
