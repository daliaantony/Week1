package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.id("j_idt88:name")).sendKeys("Dalia");
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("India");
		driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("antony.daliavm@gmail.com");
		driver.findElement(By.id("j_idt88:j_idt99")).sendKeys(Keys.TAB);
		System.out.println("Tab is applied in Email address field");
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("I am a legend");
		// Text editor driver.findElement(By.className().contains)
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("error")).getText().contains("View /input.xhtml could not be restored");
		driver.findElement(By.id("j_idt106:float-input")).click();
		driver.findElement(By.id("j_idt106:j_idt113")).getLocation();
		driver.findElement(By.id("j_idt106:j_idt122")).click();
		
		
		Thread.sleep(4000);
		driver.close();
		
	
	}

}
