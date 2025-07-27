package com.wipro.day_six;

import java.io.*;

public class TryCatchExample {
    public static void main(String[] args) {

        // Create File object pointing to the file location
        File file = new File("\"E:\\User\\Documents\\hello.docx\"");

        // Declare reader outside try so we can close in finally (if needed)
        BufferedReader reader = null;

        try {
            // FileReader reads characters from file, BufferedReader adds buffering
            reader = new BufferedReader(new FileReader(file));
            String line;

            // Read and print each line until end of file
            while ((line = reader.readLine()) != null) {
                System.out.println("File Content: " + line);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("❌ An I/O error occurred while reading the file.");
        } finally {
            // Ensure reader is closed even if an exception occurs
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException e) {
                System.out.println("❌ Failed to close the file reader.");
            }
            System.out.println("✅ Program execution complete.");
        }
    }
}
