package signuplogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Advancesearchpostingmodules {
	
	public  void Advanceposting() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhisekh Biswas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://localhost:8443/?login");		
		//driver.findElement(By.id("email")).sendKeys("sai.degala441@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("satya2019");
		//driver.findElement(By.id("login")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("call")).click();
		Thread.sleep(3000);
        driver.findElement(By.id("Advance")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("advanceid")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("proid")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("pay")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("unpaid")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("typel")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("Full Internship")).click();        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"view\"]/div[4]/div[2]/div/div[1]/div[4]/div/div[2]/div/div[2]/tags-input/div/div/input")).sendKeys("html,css");
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@id=\"view\"]/div[4]/div[2]/div/div[1]/div[4]/div/div[2]/div/div[3]/tags-input/div/div/input")).sendKeys("ceo");
        //Thread.sleep(5000);
        //driver.findElement(By.id("networkclick")).click();
        //Thread.sleep(5000);
       //driver.findElement(By.xpath("//*[@id=\"view\"]/div[4]/div[2]/div/div[1]/div[4]/div/div[2]/div/div[3]/tags-input/div/auto-complete/div/ul/li")).click();
       //Thread.sleep(5000);
       driver.findElement(By.id("sear")).click();
       Thread.sleep(5000);
       driver.findElement(By.id("microclick")).click();
       Thread.sleep(3000);
       driver.findElement(By.id("viewjob")).click();
       Thread.sleep(3000);
       driver.findElement(By.id("applyclick")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@id=\"recentChatInbox\"]/span/div[1]/div/div[2]/span[2]")).click();
       Thread.sleep(3000);
       driver.findElement(By.id("newMessageId")).sendKeys("Hi Testing");
       Thread.sleep(3000);
       driver.findElement(By.id("send")).click();        
       
     

}
}