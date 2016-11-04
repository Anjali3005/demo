package com.demo.git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Facegit {
	

	public void run(){
	WebDriver driver=new FirefoxDriver();
	driver.get("http://facebook.com");
	String Title=driver.getTitle();
	System.out.println(Title + "  Hey Mark I m on Facebook");
	driver.close();
	}


	public void run1(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://facebook.co.in");
		
		String Title=driver.getTitle();
		Assert.assertTrue(false);
		System.out.println(Title + "  Hey Mark I m on Facebook");
		driver.close();
		}
	@Test
	public void run2(){
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com");
		String A=driver.findElement(By.cssSelector(".logo.logo-w")).getAttribute("aria-label");
	
		System.out.println(A);
		driver.close();
		}
}
