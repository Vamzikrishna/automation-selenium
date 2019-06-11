package ChromeBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompanySignupandposting {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://localhost:8443/?login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[4]/div/div/div/div/div/form/div[2]/div[2]/div/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[4]/div/div/div/div/div/form/input[1]")).sendKeys("TECHNO24");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[4]/div/div/div/div/div/form/input[2]")).sendKeys("Degala24");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[4]/div/div/div/div/div/form/input[3]")).sendKeys("degala24@yopmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[4]/div/div/div/div/div/form/input[4]")).sendKeys("satya2019");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[4]/div/div/div/div/div/form/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div/div[1]/div[4]/div[2]/button[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[3]/div/div/div[3]/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span/div[2]/div/div/div[3]/div/form/span[1]/input")).sendKeys("5555555555554444");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span/div[2]/div/div/div[3]/div/form/span[2]/input")).sendKeys("12,22");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span/div[2]/div/div/div[3]/div/form/span[3]/input")).sendKeys("1234");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span/div[2]/div/div/div[3]/div/form/input")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span/div[3]/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[1]/div/div/div[2]/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[2]/span/span/span/div[3]/div[3]/div[2]/div[4]/div/div/div[2]/div[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys("Java5Angular4");
        Thread.sleep(3000);
        driver.findElement(By.id("txt")).sendKeys("You can find it all in this post, and at the top of the site. Please don't forget to subscribe to our twitter feed as well as our RSS feed. On the left side, we have a feedback button");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[2]/div/div/div[4]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[3]/div/div/div[1]/div/div[1]/tags-input/div/div/input")).sendKeys("angular,java,css,html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[3]/div/div/div[1]/div/div[1]/tags-input/div/auto-complete/div/ul/li[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[3]/div/div/div[7]/button[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[4]/div/div[1]/div[1]/div[1]/span/a/ng-pluralize")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[2]/div/div/div[4]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[3]/div/div/div[7]/button[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("interns")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[4]/div/div[1]/div[1]/div[1]/select/option[2]")).click();
        //Thread.sleep(5000);
        //driver.findElement(By.id("pay")).click();
        //Thread.sleep(3000);
        //driver.findElement(By.id("unpaidinpost")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[4]/div/div[2]/div/button[1]")).click();
        Thread.sleep(6000); 
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[1]/div/div/div[2]/a/button")).click();
        Thread.sleep(4000);    
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/div/div")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/ul/div/div/li[7]/a")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/div/div")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/ul/div/div/li[7]/a")).click();
	    Thread.sleep(5000);        		
		driver.findElement(By.id("account")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logout")).click();
	}
	
}



