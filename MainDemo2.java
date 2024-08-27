package com.gentech.constructor.overloading;

class InviseDetails
{
	InviseDetails(String name)
	{
		System.out.println("invise name is "+name);
	}
	
	InviseDetails(String name,String Date )
	{
		System.out.println("invise name and date is "+name+","+Date);
	}
	
	InviseDetails(int amount)
	{
		System.out.println("invise amount is "+amount);
	}
	InviseDetails(int amount,String name)
	{
		System.out.println("invise amount and name is "+amount+" "+name);
	}
	
	
	
	
}


public class MainDemo2 {
 public static void main(String[] args) {
	 InviseDetails i=new InviseDetails(100);
	 InviseDetails i1=new InviseDetails(10000,"prathik");
	 InviseDetails i2=new InviseDetails("prathik");
	 InviseDetails i3=new InviseDetails("prathik","26july");
}
}
