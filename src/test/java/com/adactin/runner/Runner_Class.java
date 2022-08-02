package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature", 
glue = "com.adactin.stepdefinition")

public class Runner_Class {
	
public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		
		driver = Base_Class.getBrowser("chrome");
		
		//@AfterClass
		
		

	}
	
}