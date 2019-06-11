package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Signup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhisekh Biswas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://localhost:8443");
//        driver.findElement(By.id("Company page = false")).sendKeys("false");
		driver.findElement(By.id("signup")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("user_name")).sendKeys("Satya Dega");
		Thread.sleep(5000);
		driver.findElement(By.id("user_email")).sendKeys("sai117@yopmail.com");
		Thread.sleep(5000);
		driver.findElement(By.id("user_password")).sendKeys("satya2019");
		Thread.sleep(5000);
		driver.findElement(By.id("signup")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("account")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logout")).click();
	
		
		//Gmail gmail = new Gmail();
		//gmail.gmail();
	}
}

	


