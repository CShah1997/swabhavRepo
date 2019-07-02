package com.techlabs.company_composite_pattern_employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;

public class UrlLoader implements Loader {
	private URL url;
	private HashSet<String> loadedData = new HashSet<String>();

	public UrlLoader(String url) throws MalformedURLException {
		this.url = new URL(url);
	}

	public HashSet<String> load() {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			String line;
			while ((line = in.readLine()) != null) {
				loadedData.add(line);
			}
			in.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return loadedData;
	}
}
