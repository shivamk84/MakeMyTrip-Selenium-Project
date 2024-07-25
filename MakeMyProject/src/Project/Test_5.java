package Project;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Test_5 {
	
	static String date = "28";
	static String month = "September 2024";
	
	
	
	@Test
	public void Bus_Mohit() throws Throwable {    
		
		// driver = CommonUtils.setSeleniumGrid();
		
        // Initialize WebDriver instance
        WebDriver driver = new EdgeDriver();
//        
//        // Set implicit wait and maximize window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
//
//        // Navigate to MakeMyTrip website
        driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

		driver.findElement(By.xpath("//ul[@class='makeFlex font12 headerIconsGap']/li[6]")).click();
		
		//From 
		driver.findElement(By.xpath("//div[@class='bussw_inner']//div[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Mumbai");
		Thread.sleep(2000);

		//Choosing Dropdown
		driver.findElement(By.xpath("//div[@id='react-autowhatever-1']/div/ul/li[1]")).click();
		
		//To
		driver.findElement(By.xpath("//div[@class='bussw_inner']//div[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Banglore");
		Thread.sleep(2000);

		//Choosing Dropdown
		driver.findElement(By.xpath("//div[@id='react-autowhatever-1']/div/ul/li[1]")).click();
		
		//Date
//		driver.findElement(By.xpath("//div[@class='bussw_inner']//div[3]")).click();
//		driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[3]")).click();

		// Calender
		String s1 = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
		calender1(s1, driver, date, month);
		
			
		
		Thread.sleep(2000);
		//Submit
		driver.findElement(By.id("search_button")).click();
		
		//Filters
		driver.findElement(By.xpath("(//div[@class='horiFilterBtn appendRight12 '])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'horiFilterBtn appendRight12')])[2]")).click();
		
		//CheckBoxes
		driver.findElement(By.xpath("//span[contains(text(),'Single')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Vashi')]")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Anand Rao Circle')])[1]")).click();
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-600)");

		
		//Selecting Bus
		driver.findElement(By.xpath("//div[@class='busCardContainer '][1]")).click();
		
		
		//jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);


//		jse.executeScript("window.scrollBy(0,-400)");
		driver.findElement(By.xpath("(//div[@class='tooltipWrapper']/li)[28]")).click();
//		driver.findElement(By.xpath("(//span[@data-testid='seat_horizontal_sleeper_available'])[14]")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='cta-book-seats font16 capText makeFlex hrtlCenter vrtlCenter active']")).click();

		//Booking Details
		driver.findElement(By.id("fname")).sendKeys("Mohit");
		driver.findElement(By.id("age")).sendKeys("22");
		driver.findElement(By.xpath("//div[@class='maleTab ']")).click();
		driver.findElement(By.id("dt_state_gst_info")).click();
		driver.findElement(By.xpath("//li[normalize-space()='Karnataka']")).click();
		driver.findElement(By.xpath("//span[@class='checkboxWpr']")).click();
		driver.findElement(By.id("contactEmail")).sendKeys("admin@gmail.com");
		driver.findElement(By.id("mobileNumber")).sendKeys("8888888888");
		
		//Payment Btn
		driver.findElement(By.xpath("//div[@class='paymentBtn whiteText latoBold font16 capText']")).click();

		System.out.println("Test 5 Passed Successfully...");
		
        // Close the browser
		driver.quit();
    }
	
	// Calender
			public static void calender1(String sl, WebDriver driver, String date, String month) throws InterruptedException {
				while (!month.equals(sl)) {
					Thread.sleep(2000);
					driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
					sl = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
					
				}
				List<WebElement> dates = driver.findElements(By.xpath("(//div[@class='DayPicker-Month'])[1]//div[@class='DayPicker-Day']"));
				for (WebElement x : dates) {
					if (x.getText().equals(date)) {
						Actions actions = new Actions(driver);
						actions.moveToElement(x).build().perform();
						x.click();
						break;
					}
				}
			}
		


}
