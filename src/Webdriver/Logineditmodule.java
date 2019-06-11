package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logineditmodule {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhisekh Biswas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://localhost:8443/?login");		
		driver.findElement(By.id("email")).sendKeys("satya35678@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("satya2019");
		driver.findElement(By.id("login")).click();
	    Thread.sleep(3000);
		driver.findElement(By.id("profile")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[2]/ul/div/div/li[1]/a/div[2]")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("Activity")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[2]/div/div[1]/div/div[1]/div/div[2]/a")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("vanityurl")).sendKeys("degasat");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[1]/div[4]/div[2]/button[2]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("status")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("seeking internships")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("confidence")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("i am certain of my life's calling")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("callingage")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("toto")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("next2")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("about")).sendKeys("The pleasant, earthy smell after rain. Example: Although I do love the pleasant, dewy petrichor of the post-rain afternoon, I still hope the weather stays sunny.");
	    Thread.sleep(5000);
	    driver.findElement(By.id("singlePicker")).sendKeys("72070");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/div[1]/div/div/div[2]/ul/li[1]/p")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/button[3]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[4]/div[3]/div/div/div[1]/tags-input/div/div/input")).sendKeys("html,css,angular,java");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[4]/div[3]/div/div/div[1]/tags-input/div/auto-complete/div/ul/li")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[4]/div[4]/div/div/div[1]/tags-input/div/div/input")).sendKeys("java");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[4]/div[4]/div/div/div[1]/tags-input/div/auto-complete/div/ul/li[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[4]/div[5]/div/button[2]")).click();
	    Thread.sleep(3000);
	    //driver.findElement(By.id("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[5]/div[1]/div/div[3]/div/div/div/button[1]")).click();
	    //Thread.sleep(3000);
	    driver.findElement(By.id("yes")).click();
	    //Thread.sleep(2000);
	    //driver.findElement(By.id("yesc")).click();
	    //Thread.sleep(2000);
	    //driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[5]/button[1]")).click();
	
	} 

}