package com.gentech.constructor.overloading;

class UserProfile
{
	UserProfile(String name)
	{
		System.out.println("user name is "+name);
	}
	
	UserProfile( int age )
	{
		System.out.println("user age is "+age);
	}
	
	UserProfile( String name,int age )
	{
		System.out.println("user name and age is "+ name +" "+age);
	}
	
	UserProfile( String country,String email )
	{
		System.out.println("user country and email is "+ country +" "+email);
	}
	
			
}

public class MainDemo1 {

	public static void main(String[] args) {
		UserProfile u=new UserProfile("India,","kirans2026@gmail.com");
		UserProfile u1=new UserProfile(" kiran,",20);
		UserProfile u2=new UserProfile(20);
		UserProfile u3=new UserProfile("kiran");
	}

}
