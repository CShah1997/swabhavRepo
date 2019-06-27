package com.techlabs.data_analyzer_app_test;
import java.util.List;

import com.techlabs.data_analyzer_app.*;

public class EmpDataAnalyzer {

	List<EmpData> e = readEmpData("resource/emp.txt");

    // let's print all the person read from CSV file
    for (EmpData b : empData) {
        System.out.println(b);
    }
	}
}
	
	
	

