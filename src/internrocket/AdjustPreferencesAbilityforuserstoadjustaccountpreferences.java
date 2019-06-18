package internrocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdjustPreferencesAbilityforuserstoadjustaccountpreferences {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhisekh Biswas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://developer:itshappening@dev.internrocket.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/span/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/input[1]")).sendKeys("sai.degala11@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/input[2]")).sendKeys("satya2017");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/div")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/ul/div/div/li[1]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[3]/div[1]/div[3]/div[3]/div[2]/div/div/button[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[3]/div[2]/div[1]/form/input[1]")).sendKeys("Satthi05@yopmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[3]/div[2]/div[1]/form/input[2]")).sendKeys("satya2017");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[3]/div[2]/div[1]/form/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/div")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/ul/div/div/li[1]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[3]/div[2]/div[2]/form/input[1]")).sendKeys("satya2017");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[3]/div[2]/div[2]/form/input[2]")).sendKeys("satya2019");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[3]/div[2]/div[2]/form/input[3]")).sendKeys("satya2019");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[3]/div[2]/div[2]/form/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/div")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/ul/div/div/li[7]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/span/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/input[1]")).sendKeys("Satthi05@yopmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/input[2]")).sendKeys("satya2019");
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/button")).click();

}
}