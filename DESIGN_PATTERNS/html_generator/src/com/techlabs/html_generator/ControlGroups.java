package com.techlabs.html_generator;

import java.util.ArrayList;

public class ControlGroups implements IHtmlElement{

	private String name;
	private ArrayList<IHtmlElement> listOfTags;
	
	public ControlGroups(String name) {
		this.name = name;
		listOfTags=new ArrayList<IHtmlElement>();
	}
	
	public void addTag(Control element)
	{
		listOfTags.add(element);
	}

	@Override
	public String parseToHTML() {
		String htmlStrings="<"+this.name+">\n";
		for(IHtmlElement tag:listOfTags)
		{
			htmlStrings+=tag.parseToHTML();
		}
		return htmlStrings+"</"+this.name+">";
	}
	
	

}
