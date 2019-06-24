package internrocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdvancedSearchAbilitytosearchandinteractwithotheruserspostingscompanies {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhisekh Biswas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://developer:itshappening@dev.internrocket.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/span/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/input[1]")).sendKeys("degala02@yopmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/input[2]")).sendKeys("satya2019");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[1]/div")).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[1]/ul/div/div/li[2]/a/div[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[1]/div[1]/div/div[1]/div[1]/div/div/button[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("size")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[1]/div[4]/div/div[3]/div/div[1]/select/option[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[3]/button[1]")).click();
        Thread.sleep(5000);
       driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[3]/div/div/div[2]")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[3]/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/a[1]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[1]/div")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[1]/ul/div/div/li[2]/a/div[2]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[1]/div[1]/div/div[1]/div[1]/div/div/button[1]")).click();
      Thread.sleep(4000);
      driver.findElement(By.id("pay")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[1]/div[4]/div/div[1]/div/div[1]/select/option[2]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[3]/button[1]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[3]/div/div/div[2]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[3]/div/div/div[2]/div/div/div/div/div/div[2]/div[3]/a[1]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[1]/div")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[1]/ul/div/div/li[2]/a/div[2]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[1]/div[1]/div/div[1]/div[1]/div/div/button[3]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[1]/div[4]/div/div[5]/div/div[1]/select")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[1]/div[4]/div/div[5]/div/div[1]/select/option[3]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[3]/button[1]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[3]/div/div/div[2]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[3]/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/a")).click();
      Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[1]/div")).click();
		Thread.sleep(5000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[1]/ul/div/div/li[2]/a/div[2]")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[1]/div[1]/div/div[1]/div[1]/div/div/button[2]")).click();
      Thread.sleep(5000);
      driver.findElement(By.id("size")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[1]/div[4]/div/div[3]/div/div[1]/select/option[2]")).click();
      Thread.sleep(5000);
      //driver.findElement(By.id("profit")).click();
      //Thread.sleep(3000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[3]/button[2]")).click();
      Thread.sleep(5000);
      driver.findElement(By.id("searchname")).sendKeys("JAVA 2");
      Thread.sleep(3000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[4]/button")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[3]/div/div/button[3]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[3]/div/div/button[2]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[1]/div[1]/div/div[1]/div[1]/div/div/button[3]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[1]/div[4]/div/div[5]/div/div[1]/select")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[1]/div[4]/div/div[5]/div/div[1]/select/option[3]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[3]/button[1]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[3]/div/div/div[2]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[3]/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/a")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div/div/div/div[1]/div/div[1]/div/div[2]/button[2]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span/div[3]/div/ul/li/div/input")).sendKeys("Recruit");
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span/div[3]/div/ul/li/div/button")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[1]/div")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[1]/ul/div/div/li[2]/a/div[2]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[1]/div[1]/div/div[1]/div[1]/div/div/button[2]")).click();
      Thread.sleep(4000);
      driver.findElement(By.id("size")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[1]/div[4]/div/div[3]/div/div[1]/select/option[2]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[2]/div/div[3]/button[1]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[3]/div/div/div[3]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[4]/div[3]/div/div/div[3]/div/div/div/div/div/div[2]/div[2]/a[1]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div/div[1]/div/div[1]/div/div[2]/button[1]")).click();
      Thread.sleep(4000);
      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/ul/div/div/li[7]/a")).click();
      
      
      
	}
	
	
	
}
