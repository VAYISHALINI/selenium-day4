package com.example.demo.sampletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.junit.Assert;
//import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
//import org.testng.annotations.Test;
public class App3 {
   
	public static void main( String[] args ) {
		WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
    	driver.navigate().to("https://j2store.net/free/");
    	String url = driver.getCurrentUrl(); 
    	//Assert.assertEquals(url, "http://localhost:8080/imdb/homepage");
	}
}
