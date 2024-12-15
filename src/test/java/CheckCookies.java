import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckCookies {
	public WebDriver driver;
	Set<Cookie> allcookies;
	
	@Test
	public void get_cookies() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
	 driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("vivekbhardwaj0788@gmail.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("jaimatadi");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(15000);
		
		allcookies=driver.manage().getCookies();
		for(Cookie cookies: allcookies) {
			System.out.println("Cookies generated are  ===="+cookies);
		}
		
driver.close();


	}

	@Test
	public void useCookies() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
			driver.navigate().to("https://www.instagram.com/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			
			for(Cookie cooki:allcookies) {
				driver.manage().addCookie(cooki);
			}
		driver.navigate().to("https://www.instagram.com/rajput_archanasingh/");
		Thread.sleep(10000);
		driver.quit();
	}
}
