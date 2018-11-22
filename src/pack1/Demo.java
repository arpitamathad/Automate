package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	static{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
	}
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		
	}
}
