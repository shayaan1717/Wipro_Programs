package com.wipro.day_nine;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

class Student10{	
	private int rollno;
	private String name;
	
	public Student10(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public Student10() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class  Serialization_demo{
	public static void main(String[] args) throws IOException , NotSerializableException {
		try{
		Student10 std1 = new Student10();
		std1.setRollno(10);
		std1.setName("Afrid");
		
			FileOutputStream out = new FileOutputStream("C://Users//User//Downloads//Serial.txt");
			ObjectOutputStream output = new ObjectOutputStream(out);
			output.writeObject(std1);
			
			System.out.println("Serialized data saved in file");
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}
}

