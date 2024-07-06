package automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SCROLLPAGECHECKAgain {
	
	@Test
	public static void main(String[] args) throws Throwable {
		
     System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver  driver= new ChromeDriver();
		
		driver.get("http://jqueryui.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
       
     //  ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
        
        
        ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
        ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
        
       
        
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
