package com.ReportGenerato;

import java.util.ArrayList;
import java.util.List;

public class ExcelReport extends ReportGenerator{

	private String data;
	
	private String tabularData="tabularData";
	
	public ExcelReport(){
		super("ExcelReport");
	}

	 ExcelReport(String string, ArrayList<List<String>> xl) {
		this();// this line call ExcelReport() constrructor , after creating the object it come here first line must be this or super key work or defualt but we are extended to to parent it defult super() key word
		this.data=string;
		
	}

	@Override
	public void generateContent() {
		System.out.println("Generating ExcelReport content with :"+tabularData);
	}

}
