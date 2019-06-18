package internrocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdvancedSearchValidateCreatealertbutton {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhisekh Biswas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://developer:itshappening@dev.internrocket.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/span/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/input[1]")).sendKeys("ajsagar007@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/input[2]")).sendKeys("satya2019");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/button")).click();
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
        

}
}