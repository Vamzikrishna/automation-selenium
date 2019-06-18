package IEBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Useredit {

public static void main(String[] args)throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver","C:\\Selenium IE\\MicrosoftWebDriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://localhost:8443/?login");
		
		driver.navigate().to("javascript:document.getElementById('overridelink').click()");
		driver.findElement(By.id("email")).sendKeys("degala08@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("satya2019");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("call")).click();
		Thread.sleep(5000);
        driver.findElement(By.id("Advance")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("advanceid")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("compid")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"view\"]/div[4]/div[2]/div/div[1]/div[4]/div/div[4]/div/div[2]/tags-input/div/div/input")).sendKeys("css,html,java");
        Thread.sleep(5000);
        driver.findElement(By.id("networkclick")).click();
        Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@id=\"view\"]/div[4]/div[2]/div/div[1]/div[4]/div/div[4]/div/div[2]/tags-input/div/auto-complete/div/ul/li")).click();
       Thread.sleep(5000);
       driver.findElement(By.id("sear")).click();
       Thread.sleep(7000);
       driver.findElement(By.xpath("//*[@id=\"compid\"]/div/div/div/div[1]/div[2]/div/div[1]")).click();
       Thread.sleep(3000);
       driver.findElement(By.id("viewcompany")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"view\"]/div/div/div/div/div[1]/div/div[1]/div/div[2]/button[1]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"view\"]/div/div/div/div/div[2]/div/div/button[2]")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("//*[@id=\"view\"]/div/div/div/div/div[2]/div/div/button[3]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\" \"]")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@id=\"view\"]/div/div/div/div/div[3]/div[1]/div/div/div/div/div/button[3]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"microclick\"]/div/div/div/div[1]/div[1]/div[1]")).click();
       Thread.sleep(3000);
       driver.findElement(By.id("viewjob")).click();
       Thread.sleep(3000);
       driver.findElement(By.id("applyclick")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//*[@id=\"view\"]/div/div/div/div/div[1]/div[1]/div/div[2]/button[2]")).click();
       Thread.sleep(6000);
      driver.findElement(By.xpath("//*[@id=\"recentChatInbox\"]/span/div[1]/div/div[2]/div/span")).click();
       Thread.sleep(4000);
       driver.findElement(By.id("newMessageId")).sendKeys("Hi");
       Thread.sleep(3000);
       driver.findElement(By.id("send")).click();
       Thread.sleep(6000);
       driver.findElement(By.id("call")).click();
		Thread.sleep(5000);
       driver.findElement(By.id("Advance")).click();
       Thread.sleep(5000);
       driver.findElement(By.id("advanceid")).click();
       Thread.sleep(5000);
       driver.findElement(By.id("userid")).click();
       Thread.sleep(3000);
       driver.findElement(By.id("student")).click();
       Thread.sleep(4000);
       driver.findElement(By.xpath("//*[@id=\"student\"]/option[3]")).click();           
       Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@id=\"sear\"]")).click();
       Thread.sleep(7000);
       driver.findElement(By.xpath("//*[@id=\"view\"]/div[4]/div[3]/div/div/div[2]")).click();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//*[@id=\"view\"]/div[4]/div[3]/div/div/div[2]/div/div/div/div/div/div[2]/div[2]/a")).click();
       Thread.sleep(5000);
       driver.findElement(By.id("followclick")).click();
       Thread.sleep(5000);
       driver.findElement(By.id("messageid")).click();
       Thread.sleep(5000);
       driver.findElement(By.id("replyField")).sendKeys("Hi satya");
       Thread.sleep(3000);
       driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[3]/div/form/div/button")).click();
       Thread.sleep(6000);
       driver.findElement(By.xpath("//*[@id=\"recentChatInbox\"]/span/div[1]/div/div[2]/div/span")).click();
       Thread.sleep(5000);
       driver.findElement(By.id("call")).click();
		Thread.sleep(5000);
      driver.findElement(By.id("Advance")).click();
      Thread.sleep(5000);
      driver.findElement(By.id("advanceid")).click();
      Thread.sleep(5000);
      driver.findElement(By.id("proid")).click();
      Thread.sleep(5000);
      driver.findElement(By.id("typel")).click();
      Thread.sleep(5000);
      driver.findElement(By.id("Full Internship")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@id=\"sear\"]")).click();
      
      
       
       
       
       
}
}