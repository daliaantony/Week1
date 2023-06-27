package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Microsoft");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Reetha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Antony");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("antony.daliavm@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6364450148");
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Google");
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
