package com.ReportGenerato;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		ReportGenerator re;
		re=new PDFReport("Sample Report", "This is a sample block text.");
		re.template();
		ArrayList<List<String>> xl=new ArrayList<>();
		ArrayList<String> a=new ArrayList<>();
		a.add("name");
		a.add("age");
		xl.add(a);
		a.clear();
		a.add("John");
		a.add("35");
		re=new ExcelReport("Sample Report",xl);
		re.template();
		re=new HTMLReport("Sample Report", "This is a sample block text.");
		re.template();
	}

}
