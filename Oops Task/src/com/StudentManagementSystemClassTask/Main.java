package com.StudentManagementSystemClassTask;

import java.util.Scanner;

public class Main {

	
	
	public static void adddstudent(Student[] stu,int id,String name,int [] marksofstudent,int addingindex) {
		Student s=new Student(id,name,marksofstudent);
    	stu[addingindex]=s;
	}
	
	
	
	
	public static void displayallstudents(Student[] stu ,int addingindex) {
		for(int i=0;i<addingindex;i++) {
			System.out.println(" id : " + stu[i].getId());
			System.out.println("name : " + stu[i].getName());
			System.out.println("marks :");
			for(int j=0;j<stu[i].getMarks().length;j++) {
				System.out.print(" "+ stu[i].getMarks()[j]);
			}
		}
		System.out.println();
	}
	
	
	
	
	public static void searchbyid(int id,Student[] stu,int addingindex) {
		
		for(int i=0;i<addingindex;i++) {
			if(stu[i].getId()==id) {
				System.out.println(" id : " + stu[i].getId());
				System.out.println("name : " + stu[i].getName());
				System.out.println("marks :");
				for(int j=0;j<stu[i].getMarks().length;j++) {
					System.out.print(" "+ stu);
				}
				break;
			}
		}
	}
	
	
	public static void updatedetails(int id,Student[] stu,int addingindex,String name,int[] mar) {
		
		for(int i=0;i<addingindex;i++) {
			if(stu[i].getId()==id) {
				stu[i].setName(name);
				stu[i].setMarks(mar);
				break;
			}
		}
	}
	
	
	public static void deletestudent(int id,Student[] stu,int addingindex) {
		for(int i=0;i<addingindex;i++) {
			if(stu[i].getId()==id) {
				for(int j=i+1;j<addingindex;j++) {
					stu[j-1]=stu[j];
				}
				break;
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Student stu[]=new Student[99];
		int addingindex=0;
		Scanner sc=new Scanner(System.in);
		boolean t=true;
		while(t) {
			System.out.println("1 - Add student");
			System.out.println("2 - view all students");
			System.out.println("3 - search by id");
			System.out.println("4 - update student details");
			System.out.println("5 - delete student");
			System.out.println("6 - exit");
			
			System.out.println("enter the option");
			int option=sc.nextInt();
			sc.nextLine();
			
		    switch(option) {
		    case 1:{
		    	System.out.println("enter the student id : ");
		    	int id=sc.nextInt();
		    	sc.nextLine();
		    	System.out.println("enter the student name : ");
		    	String name=sc.nextLine();
		    	System.out.println("enter the marks : ");
		    	int marksofstudent[]=new int[3];
		    	for(int i=0;i<3;i++) {
		    		marksofstudent[i]=sc.nextInt();		    	
		          }
		    	
		    	adddstudent(stu,id,name,marksofstudent,addingindex);
		    	addingindex+=1;
		    	break;
		    }
		    case 2:{
		    	displayallstudents(stu,addingindex); 
		    	break;
		    }
		    
		    case 3:{    
		    	System.out.println("enter the id");
		    	int id=sc.nextInt();
		    	sc.nextLine();
		    	searchbyid(id,stu,addingindex);
		    	break;
		    }
		    
		    case 4:{
		        System.out.println("enter the id of student wanted to : ");
		        int id=sc.nextInt();
		        sc.nextLine();
		        System.out.println("enter the update name : ");
		        String name=sc.nextLine();
		        System.out.println("enter the marks : ");
		        int mar[]=new int[3];
		        for(int i=0;i<3;i++) {
		        	mar[i]=sc.nextInt();
		        }
		        
		        updatedetails(id,stu,addingindex,name,mar);
		        
		        break;
		    }
		    
		    
		    case 5:{
		    	System.out.println("enter the id to delect");
		    	int id=sc.nextInt();
		    	sc.nextLine();
		    	deletestudent(id,stu,addingindex);
		    	addingindex-=1;
		    	break;
		    }
		    case 6:{
		    	System.out.println("Thank you.......");
		    	t=false;
		    	break;
		    }
		    default :{
		    	System.out.println("enter the correct option");
		    }
		}
	}}}


