package com.ReportGenerato;

public class PDFReport extends ReportGenerator{
	
	private String blockText="block text";
     
	
	
	
	public PDFReport(String sample, String content) {
		super("pdf");
		
	}

	@Override
	public void generateContent() {
		System.out.println("Generating PDF content with :"+blockText);
	}

}
