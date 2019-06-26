package internrocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserEditProfileAbilitytoinputandeditpersonal {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhisekh Biswas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://developer:itshappening@dev.internrocket.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/input[1]")).sendKeys("degala44@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/input[2]")).sendKeys("satya2019");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/button")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[2]/div")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[2]/ul/div/div/li[2]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"vanityurl\"]")).sendKeys("degala44");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div/div[1]/div[4]/div[2]/button[2]")).click();
        Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"status\"]")).click();
	    Thread.sleep(3000);	    
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[2]/div[3]/div[1]/select[1]/option[5]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"confidence\"]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[2]/div[3]/div[2]/select[1]/option[3]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"callingage\"]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[2]/div[3]/div[2]/select[2]/option[22]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[2]/div[3]/div[2]/button[2]")).click();
	    Thread.sleep(3000);
	    //driver.findElement(By.xpath("//*[@id=\"txt\"]")).click();
	    //Thread.sleep(4000);
	    //driver.findElement(By.xpath("//*[@id=\"txt\"]")).sendKeys("A set of several test cases for a component or system under test, where the post condition of one test is often used as the precondition for the next one");
	    //Thread.sleep(4000);
	    driver.findElement(By.xpath("//*[@id=\"student\"]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/select[1]/option[2]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/select[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/select[2]/option[5]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/select[3]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/select[3]/option[10]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[3]/div[3]/div[2]/button[3]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[4]/div[3]/div/div/div[1]/tags-input/div/div/input")).sendKeys("html,css,angular,java");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[4]/div[3]/div/div/div[1]/tags-input/div/auto-complete/div/ul/li")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[4]/div[4]/div/div/div[1]/tags-input/div/div/input")).sendKeys("java");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[4]/div[4]/div/div/div[1]/tags-input/div/auto-complete/div/ul/li[1]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[4]/div[5]/div/button[2]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div[1]/div[5]/div[1]/div/div[3]/div/div/div/button[1]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/div")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/ul/div/div/li[7]/a")).click();
	    
	    
	   
	    
	   

}
}