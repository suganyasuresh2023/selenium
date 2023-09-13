package org.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mobiles {
	
	public static WebDriver driver;
	@Test
	public void browserLanuch() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-popups");
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--no-sandbox");
	    options.addArguments("--disable-dev-shm-usage");
	    options.addArguments("start-maximized");
	    
		driver =new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
	}
	
	@Test
	public void method1() {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		
	}
	@Test
	public void method2() {
		List<WebElement> mobiles=driver.findElements(By.xpath("//div[@class='_4ddWXP _3BCh3_']"));
		for(int i=0;i<mobiles.size();i++) {
			
			WebElement mobile=mobiles.get(i);
			mobile.getText();
			
			System.out.println("getText");
		}
	}}
