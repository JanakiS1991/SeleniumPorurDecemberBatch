package test.SeleniumPorurDecemberBatch;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MakeYourTrip {

	public static void main(String[] args) {
		
		
		MakeYourTrip trip = new MakeYourTrip();
		trip.searchTrip();

	}

	public void searchTrip() {
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.navigate().to("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("span[data-cy='closeModal']")).click();
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		System.out.println("Execution started");
		//xpath = (//tagname[text()='text of the web element'])
		 driver.findElement(By.xpath("//span[text()='From']")).click();
		System.out.println("From tab identified");
		//syntax: driver.findElement(By.cssSelector("tag[attribute=value]"));
		//WebElement from =driver.findElement(By.cssSelector("input[placeholder='From']"));
//		driver.findElement(By.xpath("//input[@placeholder='From']")).click();
//		System.out.println("From textbox");
		driver.findElement(By.xpath("//span[text()='To']")).click();
		System.out.println("To tab identified");
	}

}
