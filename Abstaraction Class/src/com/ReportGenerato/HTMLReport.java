package com.ReportGenerato;

public class HTMLReport extends ReportGenerator{

	private String markupContent="markupContent";
	public HTMLReport(String string,String string1) {
		super("HTMLReport");
	}

	@Override
	public void generateContent() {
		System.out.println("Generating ExcelReport content with :"+markupContent);
		
	}

}
