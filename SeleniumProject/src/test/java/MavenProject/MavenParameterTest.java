package MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class MavenParameterTest {
	
	public void receiveData() {
		String url=System.getProperty("Url"); 
				String email=System.getenv("email");
				String password=System.getProperty("password");
				
	    Reporter.log(url,true);
		
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		
	
	
	}

}
