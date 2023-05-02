package com.example.demo.sampletest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day5qn3 {
 public static void main(String[] args) throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("401",Keys.ENTER);
	
	Alert alert=driver.switchTo().alert();
	Thread.sleep(4000);
	alert.dismiss();
	Thread.sleep(5000);
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).clear();
	driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("402",Keys.ENTER);
	Thread.sleep(4000);
	alert.accept();
	Thread.sleep(4000);
	String str=alert.getText();
	alert.accept();
	System.out.println(str);
	
	
	
}
}
