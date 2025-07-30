package com.wipro.day_nine;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Student6
{
	private String name;
	private int age;
	public Student6(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student6() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
public class SerilazationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		try {
			Student6 s1=new Student6();
			
			s1.setName("Suresh");
			s1.setAge(25);
			
			FileOutputStream out=new FileOutputStream("C:\\Users\\User\\Downloads\\Serial.txt");
			ObjectOutputStream output=new ObjectOutputStream(out);
			output.writeObject(s1);
			out.close();
			output.close();
			
			FileInputStream in=new FileInputStream("C:\\Users\\User\\Downloads\\Serial.txt");
			ObjectInputStream input=new ObjectInputStream(in);
			Student6 s2=(Student6) input.readObject();
		}
		catch(NotSerializableException e) {
			e.printStackTrace();
		}
	}
}
