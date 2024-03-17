package Pages;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	WebDriver driver;

	String path = System.getProperty("user.dir");
	
	public WebDriver getDriver(String browserName) {
		
		if (driver == null) {
			if (browserName.equalsIgnoreCase("chrome")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("headless");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(options);
			}
			else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} 
			else{
				System.out.println("Invalid Input");
			}
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));	
		return driver;
	}
	
	public void openUrl(String url) {
		driver.get(url);			
	}

	public String getTitles() {
		return driver.getTitle();
	}

	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}

}
