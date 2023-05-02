package com.example.demo.sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
//        System.out.println( "Hello World!" );
    	WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
    	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
    	  
    	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("vayisha");
    	driver.findElement(By.id("input-lastname")).sendKeys("D");
    	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("vayisha@gmail.com");
    	driver.findElement(By.id("input-password")).sendKeys("Vayisha147");
    	Thread.sleep(5000);
    	driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[1]/label")).click();
//        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
      
    	
    }
}
