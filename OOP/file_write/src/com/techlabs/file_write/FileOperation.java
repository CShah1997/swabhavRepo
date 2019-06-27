package com.techlabs.file_write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
	public static void main(String args[]){    
        try{    
          FileWriter fw=new FileWriter("D:\\cshah.txt");    
          fw.write("Welcome to Java.");   
          
          fw.close();
          usingBufferedWritter();
         }catch(Exception e){System.out.println(e);}    
         System.out.println("Success...");    
    }

	private static void usingBufferedWritter() {
		// TODO Auto-generated method stub
		String textToAppend = "Happy Learning !!";
	     
	    BufferedWriter writer;
		try {
			writer = new BufferedWriter(new FileWriter("D:\\cshah.txt", true));
			writer.newLine();   //Add new line
		    writer.write(textToAppend);
		    writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	    
	}    
}  