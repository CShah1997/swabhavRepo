package com.techlabs.file_read;

import java.io.FileReader;

public class FileOperation {
	public static void main(String args[])throws Exception{    
        FileReader fr=new FileReader("D:\\cshah.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();    
  }    
}    