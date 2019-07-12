package internrocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Usercreateapostingforpositionavaiblecreatedpostingdisplaysproperly {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhisekh Biswas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://developer:itshappening@dev.internrocket.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/input[1]")).sendKeys("satya44@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/input[2]")).sendKeys("satya2019");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/button")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[1]/div")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[1]/ul/div/div/li[7]/a/div[2]")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("find-field")).sendKeys("J2EEJava4");
        Thread.sleep(3000);
        driver.findElement(By.id("find-button")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.id("type")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[2]/div/div/div[2]/div[1]/select/optgroup[4]/option[2]")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[2]/div/div/div[4]/button")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[3]/div/div/div[1]/div/div[1]/tags-input/div/div/input")).sendKeys("java,html,css,angular");
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[3]/div/div/div[7]/button[1]")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[4]/div/div[2]/div/button[1]")).click();
	     Thread.sleep(9000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[1]/div/div/div[2]/a/button")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div/div/div/div[1]/div[1]/div/div[2]/a")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[2]/div/div/div[4]/button")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[3]/div/div/div[7]/button[1]")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.id("interns")).click();
	     Thread.sleep(4000);	     
	     driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[4]/div/div[1]/div[1]/div[1]/select/option[5]")).click();
	      Thread.sleep(4000);
	      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[4]/div/div[2]/div/button[1]")).click();
	      Thread.sleep(8000);
	      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[1]/div")).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[1]/ul/div/div/li[8]/a/div[2]")).click();
	        Thread.sleep(5000);
	      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[2]/div")).click();
	      Thread.sleep(4000);
	      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[2]/ul/div/div/li[1]")).click();
	      Thread.sleep(4000);
	      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[2]/div/div[3]/div[1]/div/div/div/div/div/button[4]")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div/div[2]")).click();
	      Thread.sleep(4000);
	      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[2]/div/div[3]/div[2]/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[3]/a[2]")).click();
	      Thread.sleep(4000);
	      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[3]/button[1]")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[3]/button[2]")).click();
	

	
	
	
	
	
	}
}