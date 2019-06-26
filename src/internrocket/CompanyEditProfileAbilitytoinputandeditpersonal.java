package internrocket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CompanyEditProfileAbilitytoinputandeditpersonal {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhisekh Biswas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://developer:itshappening@dev.internrocket.com");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/span/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/input[1]")).sendKeys("degala36@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/input[2]")).sendKeys("satya2019");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[3]/div/div/div/div/div/form/button")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[2]/div")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[2]/ul/div/div/li[2]/a")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"vanityurl\"]")).sendKeys("Degala36ASR");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div/div[1]/div[4]/div[2]/button[2]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"url\"]")).sendKeys("www.degala36asr");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"size\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div/div[2]/div[3]/div[1]/select[1]/option[3]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"profit\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div/div[2]/div[3]/div[1]/select[2]/option[2]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div/div[2]/div[3]/div[1]/select[3]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div/div[2]/div[3]/div[1]/select[3]/option[3]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"singlePicker\"]")).sendKeys("Houston, AK 99694");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div/div[2]/div[3]/div[2]/div[1]/div/div/div[2]/ul/li[1]/p")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div/div[2]/div[3]/div[2]/tags-input/div/div/input")).sendKeys("ITES");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div/div[2]/div[3]/div[2]/tags-input/div/auto-complete/div/ul/li")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div/div[2]/div[3]/div[2]/button[3]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div/div[3]/div[3]/div[2]/textarea")).sendKeys("At satya36asr we know that you want to be a savvy and successful business leader. In order to do that, your organization needs to be more efficient. The problem is you have outdated business processes that create bottlenecks");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div/div[3]/div[3]/div[2]/button[3]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div/div[4]/div[3]/div/div/div[1]/tags-input/div/div/input")).sendKeys("html,css,angular,java");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div/div[4]/div[3]/div/div/div[1]/tags-input/div/auto-complete/div/ul/li[1]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/form/div/div/div[4]/div[4]/div/button[2]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/div[2]/div[1]/header/div/div/div/div[2]/div/div[3]/ul/div/div/li[7]/a")).click();
        
        
}
}