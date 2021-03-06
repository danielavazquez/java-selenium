package day17_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*1)Open Web Browser (Chrome,Firefox,Edge)
2)Open URL [https://opensource-demo.orangehrmlive.com/](https://opensource-demo.orangehrmlive.com/) 
3)Enter user name (Admin)
4)Enter password (admin123)
5)Click on login
6)Capture title of the home page (Actual Title)
7)Verify title of the page OrgangeHRM (Expected)
8)Close Browser*/

public class FirstTestCase {

	public static void main(String[] args)
	{
		//1)Open Web Browser (Chrome,Firefox,Edge)
		//chrome
		//System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		
		//creating webdriver object
		//ChromeDriver driver=new ChromeDriver(); 
		//WebDriver driver=new ChromeDriver(); //most common one used
		
		
		//firefox
		//System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
		//WebDriver driver=new FirefoxDriver();
		
		//edge
		System.setProperty("webdriver.edge.driver", "/Users/danielavazquez/drivers/edgedriver_mac64/msedgedriver");
		WebDriver driver=new EdgeDriver();		
		

		//2)Open URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//3)Enter user name (Admin)
		//need to create a WebElement since it is a data type 
		//WebElement txtusername=driver.findElement(By.id("txtUsername")); //identification
		//txtusername.sendKeys("Admin"); //action
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin"); //identification & action in one statement
		
		//4)Enter password (admin123
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//5)Click on login
		driver.findElement(By.id("btnLogin")).click();
		
		//6)Capture title of the home page (Actual Title)
		String actualtitle= driver.getTitle();
		
		//7)Verify title of the page OrgangeHRM (Expected)
		String expectedtitle="OrangeHRM";
		
		if(actualtitle.equals(expectedtitle)) 
		{
			System.out.println("Test Passed");
		}
		else 
		{
			System.out.println("test failed");
		}
		
		//8)Close Browser
		driver.quit();
	
	
	}
	

}
