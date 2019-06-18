package signuplogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class signupwithcompany {
	
	public void signcompany() throws InterruptedException {
		// TODO Auto-generated method stub		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abhisekh Biswas\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://localhost:8443");
		driver.findElement(By.id("signup")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div/div[1]/div[4]/div/div/div/div/div/form/div[2]/div[2]/div/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("companyinfo")).sendKeys("TECHNO20");
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("Degala20");
        Thread.sleep(2000);
        driver.findElement(By.id("signupemail")).sendKeys("degala20@yopmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("signuppassword")).sendKeys("satya2019");
        Thread.sleep(2000);
        driver.findElement(By.id("join")).click();
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
        Thread.sleep(5000);
        driver.findElement(By.id("starttrial")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("createpostingscompany")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/div[2]/span/span/span/div[3]/div[3]/div[2]/div[3]/div/div/div[2]/div[2]/div/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Dotnetjava10");
		Thread.sleep(3000);
		driver.findElement(By.id("txt")).sendKeys("You can find it all in this post, and at the top of the site. Please don't forget to subscribe to our twitter feed as well as our RSS feed. On the left side, we have a feedback button");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[2]/div/div/div[4]/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[3]/div/div/div[1]/div/div[1]/tags-input/div/div/input")).sendKeys("Angular,java,css,html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[3]/div/div/div[1]/div/div[1]/tags-input/div/auto-complete/div/ul/li[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[3]/div/div/div[2]/div/div[1]/span/tags-input/div/div/input")).sendKeys("CEO");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[3]/div/div/div[2]/div/div[1]/span/tags-input/div/auto-complete/div/ul/li")).click();
        Thread.sleep(3000);
        //driver.findElement(By.id("duration")).click();
        //Thread.sleep(3000);
        //driver.findElement(By.id("hours")).click();
        //Thread.sleep(3000);
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
        Thread.sleep(5000);
        driver.findElement(By.id("pay")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("unpaidinpost")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div/div/section/article/div/div[2]/div/span[3]/div[6]/form/div/div/div[4]/div/div[2]/div/button[1]")).click();
        Thread.sleep(5000);        		
		driver.findElement(By.id("account")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("logout")).click();
		
		loginanotherapplyjobposting loginanotherapplyjobposting= new loginanotherapplyjobposting();
		loginanotherapplyjobposting.applyposting();
}
}
