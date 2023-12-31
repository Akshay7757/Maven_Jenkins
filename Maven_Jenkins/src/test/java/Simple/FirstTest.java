package Simple;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	
	@Test
	public void verifyURl() throws InterruptedException {
		System.out.println("------- Welcome to JAVA -------");
		System.out.println("------- Welcome to Jenkins -------");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay Jadhav\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver c = new ChromeDriver();
		c.get("https://www.saucedemo.com/");// get - open url
		c.manage().window().maximize();
		c.findElement(By.id("user-name")).sendKeys("standard_user");//valid
		c.findElement(By.id("password")).sendKeys("secret_sauce");//valid
		c.findElement(By.id("login-button")).click();
		assertEquals(c.getCurrentUrl(), "https://www.saucedemo.com/inventory.html", "Url is not match");
		Thread.sleep(5000);
		
	}

}
