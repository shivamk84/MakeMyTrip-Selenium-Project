package Project;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CommonUtils {

	static WebDriver driver;
	static String browser = "chrome";

	public static WebDriver setSeleniumGrid() throws Throwable {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.ANY);

		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			cap.merge(options);
			driver = new RemoteWebDriver(new URL("http://9.113.178.57:4444/wd/hub"), cap);
		} else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			cap.merge(options);
			driver = new RemoteWebDriver(new URL("http://9.113.178.57:4444/wd/hub"), cap);
		} else if (browser.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions();
			cap.merge(options);
			driver = new RemoteWebDriver(new URL("http://9.113.178.57:4444/wd/hub"), cap);
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();

		return driver;
	}


	public static WebDriver Calling_1() throws Throwable {

		WebDriver driver = CommonUtils.setSeleniumGrid();
		
//		 WebDriver driver = new EdgeDriver();
//		 driver.get("https://www.makemytrip.com/");
//		 driver.manage().window().maximize();
		
		return driver;
		
	}

}
