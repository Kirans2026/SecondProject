package com.gentech.abstract1.programs;
abstract class School
{
	String schoolName;
	abstract void getName(String schoolName);
	School(String schoolName)
	{
		this.schoolName=schoolName;
		System.out.println("school name :"+this.schoolName);
	}
}
class Student extends School
{
	int age;
	String studentName;
	void getName(String schoolName)
	{
		System.out.println("school name :"+schoolName);
	}
	Student(String studentName,int age)
	{
		super("nitte");
		this.age=age;
		this.studentName=studentName;
		System.out.println("student name :"+this.studentName);
		System.out.println("student age :"+age);
	}
}
class Library extends Student
{
	String bookName;
	int bookId;
	Library(String studentName,int age,String bookName,int bookId)
	{
		super(studentName,age);
		this.bookId=bookId;
		this.bookName=bookName;
		System.out.println("book name :"+this.bookName);
		System.out.println("Book id :"+this.bookId);
	}
}

public class Prog5 {
public static void main(String[] args) {
		
		Library obj=new Library("kiran",23,"design",1);
		obj.getName("niitte");
	}

}
