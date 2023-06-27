package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSalesforce {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.name("pw")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		
		Thread.sleep(3000);
		driver.close();


	}

}
