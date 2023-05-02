package com.example.demo.sampletest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App4 {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
    WebDriver driver = new EdgeDriver();
    String url="https://demo.opencart.com/index.php?route=account/register&language=en-gb";
   
    //Launching the url
    driver.get(url);
    //maximize the window screen
    driver.manage().window().maximize();
    //Navigating down
//    JavascriptExecutor js =  (JavascriptExecutor) driver;
//    js.executeScript("window.scrollBy(0,800)", args);
//   
    String curl =driver.getCurrentUrl();
    if(curl.equals(url)) {
    System.out.print("Valid");
    }
}
}
