package IEBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class usersignup {

	public static void main(String[] args)throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver","C:\\Selenium IE\\MicrosoftWebDriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://localhost:8443/?login");
		
		driver.navigate().to("javascript:document.getElementById('overridelink').click()");
	    Thread.sleep(7000);
		driver.findElement(By.id("signup")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("satya459");
		Thread.sleep(2000);
		driver.findElement(By.id("signupemail")).sendKeys("satya459@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("signuppassword")).sendKeys("satya2019");
		Thread.sleep(2000);
		driver.findElement(By.id("join")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("oneline")).sendKeys("Testing");
		Thread.sleep(3000);
	    driver.findElement(By.id("txt")).sendKeys("Selenium Testing");
	    Thread.sleep(3000);
	    driver.findElement(By.id("finish")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("trialversion")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span/div[2]/div/div/div[3]/div/form/span[1]/input")).sendKeys("5555555555554444");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span/div[2]/div/div/div[3]/div/form/span[2]/input")).sendKeys("12 / 22");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span/div[2]/div/div/div[3]/div/form/span[3]/input")).sendKeys("1234");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span/div[2]/div/div/div[3]/div/form/input")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("starttrial")).click();
	    Thread.sleep(4000);
		driver.findElement(By.id("account")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logout")).click();
		
		
}
}