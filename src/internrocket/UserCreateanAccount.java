package internrocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserCreateanAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhisekh Biswas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://developer:itshappening@dev.internrocket.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/button")).click();
		Thread.sleep(2000);        
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[4]/div/div/div/div/div/form/input[2]")).sendKeys("Degala39");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[4]/div/div/div/div/div/form/input[3]")).sendKeys("degala39@yopmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[4]/div/div/div/div/div/form/input[4]")).sendKeys("satya2019");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[4]/div/div/div/div/div/form/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div/div[1]/div[4]/div[2]/button[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[2]/div/div/div[2]/div/button")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span/div[2]/div/div/div[3]/div/form/span[1]/input")).sendKeys("5555555555554444");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span/div[2]/div/div/div[3]/div/form/span[2]/input")).sendKeys("12,22");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span/div[2]/div/div/div[3]/div/form/span[3]/input")).sendKeys("1234");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span/div[2]/div/div/div[3]/div/form/input")).click();
        Thread.sleep(8000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span/div[3]/div/button")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/div")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/ul/div/div/li[3]/a")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/ul/div/div/li[7]/a")).click();
        
	
	
	
	
	
	
	
	}
}