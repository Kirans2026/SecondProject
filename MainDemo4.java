package com.gentech.constructor.overloading;


class PdfReport
{
	PdfReport(String title)
	{
		System.out.println("title name is "+title);
	}
	
	PdfReport(String author,int pages )
	{
		System.out.println("report author and pages is "+author+", "+pages);
	}
	
	PdfReport(int pages)
	{
		System.out.println("report pages is "+pages);
	}
	
	PdfReport(double filesize)
	{
		System.out.println("report filesize is "+filesize);
	}
	
	PdfReport(String title,double filesize)
	{
		System.out.println("title name and filesize is "+ title +  +filesize);
	}
	
	
	
	
}
public class MainDemo4 {
	public static void main(String[] args) {
		PdfReport p1=new PdfReport(100);
		PdfReport p2=new PdfReport("method overloading ",10.5);
		PdfReport p3=new PdfReport(10.5);
		PdfReport p4=new PdfReport("kiran",100);
		PdfReport p5=new PdfReport("method overloading");
		
	}
}
