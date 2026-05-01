package com.ReportGenerato;

public abstract class ReportGenerator {
   private String filttype;
   
   public ReportGenerator(String string) {
	   this.filttype=string;
}

public abstract void  generateContent();
   
   public void openFile() {
	   System.out.println("opening  "+this.filttype );
   }
   public void writeContent() {
	   System.out.println("Writing content in "+this.filttype);
   }
   public void saveFile() {
	   System.out.println("saving "+this.filttype);
   }
   
   public void template() {
	   generateContent();
	   openFile();
	   writeContent();
	   saveFile();
   }
}
