package com.ElearningPlatform;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     User u;
     ArrayList<String> subjects=new ArrayList<>();
     subjects.add("math");
     subjects.add("science");
     
     ArrayList<Integer> marks=new ArrayList<>();
     marks.add(90);
     marks.add(85);
     u=new Student("student1","student1@gmail.com",subjects,marks);
     u.accessDashboard();
     u.login();
     u.logout();
     u.updateProfile();
	}

}
