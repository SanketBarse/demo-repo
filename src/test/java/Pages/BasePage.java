package Pages;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	WebDriver driver;
	
	String path = System.getProperty("user.dir");
	
	public WebDriver getDriver(String browserName) {
		
		if (driver == null) {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", path + "\\src\\static\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", path + "\\src\\static\\msedgedriver.exe");
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
