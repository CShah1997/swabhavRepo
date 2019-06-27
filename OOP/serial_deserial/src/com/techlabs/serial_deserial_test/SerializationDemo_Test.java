package com.techlabs.serial_deserial_test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlabs.serial_deserial.*;
public class SerializationDemo_Test {

	public static void main(String[] args) 
    {    
        SerializationDemo object = new SerializationDemo("chirag"); 
        String filename = "file.ser"; 
          
        // Serialization  
        try
        {    
            
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
           
            out.writeObject(object); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
  
  
        SerializationDemo object1 = null; 
  
        // Deserialization Start
        try
        {    
       
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
           
            object1 = (SerializationDemo)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println("name = " + object1.name); 
           
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
  
    } 
}
