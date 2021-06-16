package test123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_cleass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //System.out.println("test");
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neha\\Desktop\\Eclipse\\Driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver= new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.com/");
		//System.out.println("Title of the webpage is:" +driver.getTitle());
		//System.out.println("Title of the webpage is:" +driver.getCurrentUrl());
		//driver.close();  //
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		WebElement searchstore = driver.findElement(By.id("small-searchterms"));
		 System.out.println("'Display status:" +searchstore.isDisplayed());
		 System.out.println("'Display status:" +searchstore.isEnabled());
		 driver.close();
	}

}
