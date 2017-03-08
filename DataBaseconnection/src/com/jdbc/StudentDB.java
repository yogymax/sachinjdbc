/**
 * 
 */
package com.jdbc;

public class StudentDB 
{
	private String name;
	private String address;
	private int rollno;
	private int age;
	/*public StudentDB(String name, String address, int rollno, int age) 
	{
		super();
		this.name = name;
		this.address = address;
		this.rollno = rollno;
		this.age = age;
	}
	*/
	public String toString()
	{
		return "roll=:"+rollno+"name=:"+name+"address=:"+address+"age:="+age;
	
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public int getRollno() 
	{
		return rollno;
	}
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	
	
	
	

}
