package test.SeleniumPorurDecemberBatch;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class MakeMyTripLoginWindow {
	
	public void alertWindow() {
		
		WebDriver driver = new EdgeDriver();
		System.out.println("Browser Launch");
		driver.navigate().to("https://www.makemytrip.com/");
		System.out.println("Make My Trip");
		driver.manage().window().maximize();
		System.out.println("Maximize");
//		driver.findElement(By.cssSelector("span[data-cy='closeModal']")).click();
		//xpath = (//tagname[@attribute='value'])
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		System.out.println("Window closed");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MakeMyTripLoginWindow alert = new MakeMyTripLoginWindow();
		alert.alertWindow();

	}

}
