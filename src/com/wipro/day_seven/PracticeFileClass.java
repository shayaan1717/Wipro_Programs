package com.wipro.day_seven;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

public class PracticeFileClass {

	public static void main(String[] args) {
		
		try {
		File love = new File("C:\\Users\\User\\Downloads\\Baby.txt");
		
//	File Creating Part
//		if(love.createNewFile()) 
//			System.out.println("File Has been created : " +love);
//		else
//			System.out.println("Path not given correctly");
		
//	File Writing Part	
//		FileWriter myWrite = new FileWriter(love);
//		myWrite.write("Hey Wassup Baby How You Doin? ");	
//		myWrite.close();
//	
//		System.out.println("File contain written inside");
		
//  File Reading Part
		Scanner BabyGirl = new Scanner(love);
		
		while(BabyGirl.hasNextLine()) {
			String data = BabyGirl.nextLine();
			System.out.println(data);
		}
		BabyGirl.close();
	
		
		}catch(IOException e) {
			System.out.println("Error Occurred");
			e.printStackTrace();
		}

	}

}
