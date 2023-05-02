package com.example.demo.sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5qn4 {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver1=new EdgeDriver();
	WebDriver driver2=new EdgeDriver();
	WebDriver driver3=new EdgeDriver();
	 String url="https://www.google.com/";
	    driver1.get(url);
	    driver2.get(url);
	    driver3.get(url);
	 driver1.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Apple",Keys.ENTER) ;
	 driver2.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium",Keys.ENTER) ;
	 driver3.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Cucumber",Keys.ENTER) ;
	 String t1=driver1.getTitle();
	    System.out.println(t1);
	   
	    String t2=driver2.getTitle();
		 
	    System.out.println(t2);
	   
	    String t3=driver3.getTitle();
	    System.out.println(t3);
	   
	    String msg1=driver1.getWindowHandle();
	    System.out.println(msg1);
	    String msg2=driver2.getWindowHandle();
	    System.out.println(msg2);
	    String msg3=driver3.getWindowHandle();
	    System.out.println(msg3);
	 
}
}
