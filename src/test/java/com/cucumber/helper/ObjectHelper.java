package com.cucumber.helper;

import org.openqa.selenium.By;

public class ObjectHelper {
	
	protected static By InputBox_Below_Label(String fieldName) {
		return By.xpath("//*[.='"+fieldName+"']/following::input[1]");
	}
	
	protected static By Button(String fieldName) {
		return By.xpath("//button[@type='submit' and contains(., '"+fieldName+"')]");
	}
	
	
	
	protected static By InputBox_With_name(String fieldName) {
		return By.xpath("//input[@name='"+fieldName+"']");
	}

}


