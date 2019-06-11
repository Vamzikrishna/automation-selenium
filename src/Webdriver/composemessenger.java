package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class composemessenger {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhisekh Biswas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://localhost:8443/?login");		
		driver.findElement(By.id("email")).sendKeys("sai.degala441@gmail.com");
		driver.findElement(By.id("password")).sendKeys("satya2019");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("messenger")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("composeclick")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("myInput")).sendKeys("DELETED");
		Thread.sleep(9000);
		driver.findElement(By.id("select")).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("newMessageId")).click();
		//Thread.sleep(5000);
		driver.findElement(By.id("newMessage")).sendKeys("Testing123");
		Thread.sleep(5000);
		driver.findElement(By.id("send")).click();
		
		
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[M103.097,24.83l-55.229,55.23c-0.094,0.094 -0.2,0.166 -0.328,0.206l-6.714,2.622l-5.089,1.993c-1.094,0.43 -2.509,-0.985 -2.089,-2.079l2.052,-5.26l2.562,-6.554c0.051,-0.117 0.123,-0.222 0.206,-0.317l55.241,-55.229]")).click();
		
		
		//driver.findElement(By.id("recentChatInbox")).click();
		//Thread.sleep(5000);

	}

}
