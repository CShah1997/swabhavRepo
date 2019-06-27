package com.techlabs.extra_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InfoRetriveUrl {
	public static void main(String args[]) {
		try {
			String str = args[0];
			System.out.println(str);
			String pattern1 = "developer=(\\w+)";
			Pattern devPattern = Pattern.compile(pattern1);
			Matcher devMatcher = devPattern.matcher(str);

			String pattern2 = "location=(\\w+)";
			Pattern locPattern = Pattern.compile(pattern2);
			Matcher locMatcher = locPattern.matcher(str);

			String pattern3 = "www.(\\w+).com";
			Pattern compPattern = Pattern.compile(pattern3);
			Matcher compMatcher = compPattern.matcher(str);
			
			
			if (devMatcher.find()) {
				System.out.println(devMatcher.group());
			} else {
				System.out.println("no");
			}

			if (locMatcher.find()) {
				System.out.println(locMatcher.group());
			} else {
				System.out.println("no");
			}

			if (compMatcher.find()) {
				String a = compMatcher.group();
				//System.out.println(a);
				String b=a.substring(4);
				//System.out.println(a.substring(4));
				
				String pattern4 = "(\\w+)";
				Pattern r4 = Pattern.compile(pattern4);
				Matcher m4 = r4.matcher(b);
				
				if (m4.find()) {
					System.out.println(m4.group());
				} else {
					System.out.println("no");
				}
				
								
			} else {
				System.out.println("no");
			}

				
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
