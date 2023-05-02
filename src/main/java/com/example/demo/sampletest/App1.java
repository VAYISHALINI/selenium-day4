package com.example.demo.sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App1 {

	public static void main( String[] args ) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
    	driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
    	driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("vayisha");
    	driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("vayisha@gmail.com");
    	driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("vayishalini");
    	driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("vayish@gmail.com");
    	driver.findElement(By.xpath("//*[@id=\"input-theme\"]/div[2]/label")).click();
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("this is msg box");
    	
    	driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
    	driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
	}
}
