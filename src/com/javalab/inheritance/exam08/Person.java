package com.javalab.inheritance.exam08;

public class Person {
	
	private String name;
	private int age;
	private String eMail;
	private String department;
	
	public Person() {
		
	}
	
	public Person(String name , int age , String eMail , String department) {
		this.name = name;
		this.age = age;
		this.eMail = eMail;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + this.getName());
		System.out.println("나이 : " + this.getAge());
		System.out.println("이메일 : " + this.geteMail());
		System.out.println("학과 : " + this.getDepartment());
	}

}
