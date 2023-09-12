package org.test;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Junt1 {
	public static WebDriver driver;
	@Test
	public void browserlaunch () {

		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		
		
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-notifications");
		options.addArguments("remote-allow-origins=*");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("start-maximized");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		
	}
	@Test
	public void method1() {
		try {
			WebElement close =  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
			close.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
			


		    WebElement appliances =  driver.findElement(By.xpath("//div[text()='Appliances']"));
		    appliances .click();
		
			
		
		
	}
	@Test
	public void method2() {
		
			WebElement ac =  driver.findElement(By.xpath("(//img[@alt='AC-Large-Mall-Mode-Nav-1'])[2]"));
			ac.click();  
	}
	@Test
	public void method3() {
		
		    WebElement acname =  driver.findElement(By.xpath("(//div[text()='Blue Star Convertible 5 in 1 Cooling 2023 Model 1.5 Ton 3 Star Split Inverter Multi Sensors, Stabalize...'])[1]"));
		    acname.click();
	}
	@Test
	public void method4() {
		Set<String> child = driver.getWindowHandles();
		for (String x : child) {
			driver.switchTo().window(x);
		}
		    
	}

	@Test
	public void method5() {
		
		    WebElement capacity =  driver.findElement(By.xpath("//a[text()='1 Ton']"));
		    capacity.click();
	}
	@Test
	public void method6() {
		
		    WebElement rating =  driver.findElement(By.xpath("//a[text()='3 Star']"));
		    rating.click();
	}
	@Test
	public void method7() {
		
		    WebElement buynow =  driver.findElement(By.xpath("//button[@class='_2KpZ6l 2U9uOA ihZ75k 3AWRsL']"));
		    buynow.click();
	}
	@Test
	public void method8() {
		
		    WebElement phno =  driver.findElement(By.xpath("//input[@maxlength='auto']"));
		    phno.sendKeys("9876543210");
	}
	@Test
	public void method9() {
		 WebElement cont =  driver.findElement(By.xpath("//button[@class='_2KpZ6l 20xBvF 3AWRsL']"));
		    cont.click();
	}




}
