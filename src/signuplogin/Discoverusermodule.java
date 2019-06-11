package signuplogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Discoverusermodule {
	
	public void discover() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhisekh Biswas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://localhost:8443/?login");		
		//driver.findElement(By.id("email")).sendKeys("ajsagar007@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("satya2019");
		//driver.findElement(By.id("login")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("call")).click();
		Thread.sleep(3000);
        driver.findElement(By.id("Advance")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("findname")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("find-field")).sendKeys("satyadegala");
        Thread.sleep(3000);
        driver.findElement(By.id("find-button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[3]/div/div/div[1]/div")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[3]/div/div/div[1]/div/div/div/div/div/div[2]/div[2]/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"view\"]/div/div/div[1]/div/div[1]/div/div[2]/button[1]")).click();
        Thread.sleep(3000);
         driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div/div[1]/div/div[1]/div/div[2]/button[3]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("replyField")).sendKeys("Hi jena sena");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[3]/div/form/div/button")).click();
	    
        Advancesearchpostingmodules Advancesearchpostingmodules= new Advancesearchpostingmodules();
        Advancesearchpostingmodules.Advanceposting();
}
}