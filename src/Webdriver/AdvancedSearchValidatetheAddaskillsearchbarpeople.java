package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdvancedSearchValidatetheAddaskillsearchbarpeople {
	
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
        driver.findElement(By.id("advanceid")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("userid")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"view\"]/div[4]/div[2]/div/div[1]/div[4]/div/div[5]/div/div[4]/tags-input/div/div/input")).sendKeys("css,html,angularjs");
        Thread.sleep(5000);
        //driver.findElement(By.id("networkclick")).click();
        //Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@id=\"view\"]/div[4]/div[2]/div/div[1]/div[4]/div/div[5]/div/div[4]/tags-input/div/auto-complete/div/ul/li[1]")).click();
       Thread.sleep(5000);
       driver.findElement(By.id("sear")).click();

}
}