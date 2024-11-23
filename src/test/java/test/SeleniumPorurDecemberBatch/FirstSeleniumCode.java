package test.SeleniumPorurDecemberBatch;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstSeleniumCode {
	
	public void launch() {
		WebDriver browser = new ChromeDriver();
		//WebDriver browser = new EdgeDriver();
		
		browser.manage().window().maximize();
		//browser.manage().window().minimize();
		browser.get("https://www.amazon.com/");
		//browser.navigate().to("https://www.amazon.com/");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstSeleniumCode obj = new FirstSeleniumCode();
		obj.launch();
	}

}
