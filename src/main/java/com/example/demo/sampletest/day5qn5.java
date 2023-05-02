package com.example.demo.sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5qn5 {
 public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.abhibus.com/bus-ticket-booking");
	driver.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys("Trichy");
	driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("coimbatore");
	WebElement date = driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
    JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("arguments[0].setAttribute('value','27/04/2023')", date);
	
}
}
