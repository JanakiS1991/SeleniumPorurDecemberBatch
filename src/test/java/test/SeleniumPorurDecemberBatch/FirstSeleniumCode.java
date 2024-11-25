package test.SeleniumPorurDecemberBatch;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstSeleniumCode {
	
	public void launch() {
		
		/***Browser Launch***/
//		WebDriver browser = new ChromeDriver();
		WebDriver browser = new EdgeDriver();
//		WebDriver browser = new FirefoxDriver();		
//		WebDriver browser = new SafariDriver();
		
		browser.manage().window().maximize();
		//browser.manage().window().minimize();
//		browser.get("https://www.amazon.com/");
//		browser.navigate().to("https://www.amazon.com/");
		browser.navigate().to("https://www.facebook.com/");
//		browser.navigate().back();
//		browser.navigate().forward();
//		browser.navigate().refresh();
	
		/***Browser Close/Quit***/		
//		browser.close();
//		browser.quit();
		
		/* *****Locators******* 
		 * 1. By id --> syntax: driver.findElement(By.id("element id"));
		 * 2. By Name --> syntax: driver.findElement(By.name("element name"));
		 * 3. By ClassName --> syntax: driver.findElement(By.className("element class name"));
		 * 4. By TagName --> syntax: driver.findElement(By.tagName("element html tag name"));
		 * 5. By Link Text --> syntax: driver.findElement(By.linkText("element link text"));
		 * 6. By Partial Link Text --> syntax: driver.findElement(By.partialLinkText("partial link text"));
		 * 7. By CSS --> syntax: driver.findElement(By.cssSelector("css selector"));
		 * 8. By Xpath--> syntax: driver.findElement(By.xpath("xpath"));
		 */
		
		/*
		 * WebElement userName = browser.findElement(By.id("email"));
		 * userName.sendKeys("xyz123"); userName.clear();
		 */
//		browser.findElement(By.name("email")).sendKeys("selenium");
//		browser.findElement(By.id("pass")).sendKeys("xyz123");
//		browser.findElement(By.className("inputtext _55r1 _6luy"));
//		browser.findElement(By.name("login")).click();
//		browser.findElement(By.tagName("element html tag name"));
//		browser.findElement(By.linkText("Forgotten password?"));
//		browser.findElement(By.partialLinkText("password"));
		
//		browser.findElement(By.xpath("xpath"));
				
		/******CSS Selector****
		 * This is the fastest locator
		 * 7 types
		 * 1. Tag & id --> syntax: driver.findElement(By.cssSelector("tag#id"));
		 * 2. Tag & Class--> syntax: driver.findElement(By.cssSelector("tag.class"));
		 * 3. Tag & attribute--> syntax: driver.findElement(By.cssSelector("tag[attribute=value]"));
		 * 4. Tag, Class & attribute--> syntax: driver.findElement(By.cssSelector("tag.class[attribute=value]"));
		 * 5. starts with--> syntax: driver.findElement(By.cssSelector("tagname[attribute^='starting value']")); or [attribute^='staring value']
		 * 6. ends with--> syntax: driver.findElement(By.cssSelector("tagname[attribute$='ending value']""));
		 * 7. contains--> syntax: driver.findElement(By.cssSelector("tagname[attribute*='any value']""));
		 * 
		 * */
		//1. Tag & id 
//		browser.findElement(By.cssSelector("input#email")).sendKeys("testusername");
		//2. Tag & Class  --need to check
//		browser.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi")).sendKeys("testPSWD");
		//3. Tag & attribute
//		browser.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("3rdOption");
		
		//4. Tag, Class & attribute --need to check
//		browser.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi[aria-label='Password']")).sendKeys("4thOption");
//		browser.findElement(By.cssSelector("input.inputtext _55r1 _6luy _9npi[data-testid='royal_email']")).sendKeys("4thOption");
		
		//5.starts with
//		browser.findElement(By.cssSelector("input[class^='inputtext']")).sendKeys("5thOption");
		//6. ends with
//		browser.findElement(By.cssSelector("input[class$='_9npi']")).sendKeys("6thOption");
		//7. contains
//		browser.findElement(By.cssSelector("input[class*='_55r1']")).sendKeys("6thOption");
		
		/****** Xpath **********
		 * 2 types:
		 * Absolute Xpath --> starts with single forward slash /
		 * Relative Xpath --> starts with double forward slash //
		 * syntax: driver.findElement(By.xpath("xpath"));
		 * */
		
		/****** Relative Xpath *******
		 * 5 different types 
		 * 1. Basic xpath --> xpath = (//tagname[@attribute='value'])
		 * 2. And or      --> xpath = (//tagname[@attribute1='value1' or @attribute2='value2'])
		 * 				  --> xpath = (//tagname[@attribute1='value1' and @attribute2='value2'])
		 * 3. Starts-with --> xpath = (//tagname[starts-with(@attribute,'starting value of the attribute'])
		 * 4. contains    --> xpath = (//tagname[contains(@attribute,'partial value of the attribute'])
		 * 5. text()      --> xpath = (//tagname[text()='text of the web element'])
		 */
		
		/******* Xpath axes methods *******
		 * If there is no attribute or the attribute value gets change dynamically
		 * 1. Following: 		Xpath = //tagname[@attribute='value']//following::tagname of current mode
		 * 2. Following-sibling:Xpath = //tagname[@attribute='text']//following-sibling::tagname of current mode
		 * 3. Parent: Xpath = //tagname[@attribute='text']//parent::tagname of current mode
		 * 4. Child: Xpath = //tagname[@attribute='text']//child::tagname of current mode
		 * 5. Preceding: Xpath = //tagname[@attribute='text']//proceding::tagname of current mode
		 * 6. Ancestor: Xpath = //tagname[@attribute='text']//anchestor::tagname of current mode
		 * 7. Descendant: Xpath = //tagname[@attribute='text']//descendant::tagname of current mode
		 * */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstSeleniumCode obj = new FirstSeleniumCode();
		obj.launch();
	}

}
