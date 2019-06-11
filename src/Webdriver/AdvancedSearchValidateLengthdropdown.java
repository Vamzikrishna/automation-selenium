package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdvancedSearchValidateLengthdropdown {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhisekh Biswas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://localhost:8443/?login");		
		driver.findElement(By.id("email")).sendKeys("sai.degala441@gmail.com");
		driver.findElement(By.id("password")).sendKeys("satya2019");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("call")).click();
		Thread.sleep(5000);
        driver.findElement(By.id("Advance")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("advanceid")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("proid")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("typel")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("challenge")).click();
        
	}
	
}
