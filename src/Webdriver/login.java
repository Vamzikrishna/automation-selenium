package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhisekh Biswas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://localhost:8443/?login");		
		driver.findElement(By.id("email")).sendKeys("satya6892@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("satya2019");
		driver.findElement(By.id("login")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("profile")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("companyfirst")).click();
	    
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("wonder");
		Thread.sleep(3000);
		driver.findElement(By.id("company-summary")).sendKeys("A company is a legal entity formed by a group of individuals to engage in and operate a business enterprise");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div/div[1]/div[4]/div[2]/button[1]")).click();
	    //Thread.sleep(5000);
		//driver.findElement(By.id("account")).click();	    
		//Thread.sleep(5000);
		//driver.findElement(By.id("logout")).click();
		
		
		
	    //driver.findElement(By.className("badge badge-white header-notification")).click();
			
			//driver.findElement(By.id("header-contain"));
		
		//driver.findElement(By.id("logoutId")).click();		

	}

}