package com.techlabs.data_analyzer_app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DataExtractor {

	public static List readEmpData(String fileName) {
        List books = new ArrayList();
        Path pathToFile = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
        	
            String line = br.readLine();

            while (line != null) {

         
                String[] attributes = line.split(",");

                EmpData empData = createEmpData(attributes);

                // adding book into ArrayList
                empData.add(empData);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return empData;
    }

    private static EmpData createEmpData(String[] metadata) {
        String name = metadata[0];
        int price = Integer.parseInt(metadata[1]);
        String author = metadata[2];

        // create and return book of this metadata
        return new Book(name, price, author);
    }

}
