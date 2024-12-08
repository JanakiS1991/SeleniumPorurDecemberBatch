package test.SeleniumPorurDecemberBatch;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonShopping {
	
	public void shopping() {
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser launch");
		driver.navigate().to("https://www.amazon.com/");
		System.out.println("Amazon Portal");
		driver.manage().window().maximize();
		System.out.println("Maximize");
		
		WebElement alert = driver.findElement(By.xpath("//input[@data-action-type='DISMISS']"));
		alert.click();
		System.out.println("Dismiss");
		driver.findElement(By.cssSelector("input[placeholder='Search Amazon']")).sendKeys("shoes");	
		System.out.println("Search Shoes");
		driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
		System.out.println("click Search icon");
		driver.findElement(By.linkText("adidas Men's Lite Racer Adapt 7.0 Sneaker")).click();
		System.out.println("Select");
		String str = driver.getTitle();
		System.out.println("title :"+str);
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AmazonShopping shop = new AmazonShopping();
		shop.shopping();

	}

}
