package com.sel;
ytdtdytknjvcjvgjh nkhjkh

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LunchBrowser {
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	    ChromeOptions option = new ChromeOptions();
	    option.addArguments("start-maximized");
	    option.addArguments("disable-infobars");
	    option.addArguments("--headless");
		WebDriver driver = new ChromeDriver(option);
		String url = "https://www.facebook.com/";
		
		// Lunching url
		driver.get(url);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		if (url.equals(currentUrl)) {	
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		WebElement testName = driver.findElement(By.id("email"));
		testName.sendKeys("Mani");
		WebElement textPass = driver.findElement(By.id("pass"));
		textPass.sendKeys("Kandan");
		WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
		btn.click();
		
	}

}
