package com.ElearningPlatform;

import java.util.ArrayList;

public class Student extends User{
	
	ArrayList<String> subject=new ArrayList<>();
	ArrayList<Integer> marks=new ArrayList<>();

	Student(String username,String email,ArrayList<String> subjects,ArrayList<Integer> marks){
		super(username,email,"students");
		this.subject=subjects;
		this.marks=marks;
	}
	
	@Override
	public void accessDashboard() {
		System.out.println("Accessing student dashboard: Enrolled\r\n"
				+ "Courses :"+this.subject);
		System.out.println("Grades : "+this.marks);
	}
}
