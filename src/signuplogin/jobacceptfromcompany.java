package signuplogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jobacceptfromcompany {
	
	public void accept() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhisekh Biswas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://localhost:8443/?login");		
		driver.findElement(By.id("email")).sendKeys("degala08@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("satya2019");
		driver.findElement(By.id("login")).click();
	    Thread.sleep(3000);
		driver.findElement(By.id("call")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[1]/ul/div/div/li[8]/a")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[3]/div/div[5]/div[2]/div[3]/a[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[2]/span[2]/div/div/span/div[1]/div/div[1]/div[2]/button[2]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.id("accept")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[2]/span/div[1]/div/div[2]/div/span")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("newMessageId")).sendKeys("accept");
	    Thread.sleep(5000);
	    driver.findElement(By.id("send")).click();
	    Thread.sleep(7000);
		driver.findElement(By.id("account")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logout")).click();
	    
	   
	  
	
	}
}