package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdvancedSearchValidateCreatealertbuttonCompany {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhisekh Biswas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://localhost:8443/?login");		
		driver.findElement(By.id("email")).sendKeys("ajsagar007@gmail.com");
		driver.findElement(By.id("password")).sendKeys("satya2019");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("call")).click();
		Thread.sleep(5000);
        driver.findElement(By.id("Advance")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("compid")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("size")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("first")).click();
        Thread.sleep(5000);
        //driver.findElement(By.id("profit")).click();
        //Thread.sleep(3000);
        driver.findElement(By.id("creataleat")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("searchname")).sendKeys("JAVA 2");
        Thread.sleep(3000);
        driver.findElement(By.id("saveclick")).click();
}
}