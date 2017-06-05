package bm.petclinic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PetClinic {
	public static WebDriver driver;
	@BeforeSuite

	public void setup(){
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\maudas\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://petclinictomcat.mybluemix.net/");
		
	}

	@Test
	public void getTitle(){
		String title=driver.getTitle();
		Assert.assertEquals(title, "PetClinic :: a Spring Framework demonstration");
		//driver.findElement(By.xpath("//div[@id='main-navbar']/ul/li[3]/a")).click();
		
	}
}
