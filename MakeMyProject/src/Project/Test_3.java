package Project; 

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_3 {

	static String Adults = "1";
	
	static String date = "28";
	static String month = "September 2024";
	
	
	// Rooms and Guests
		public static void GuestsAndRooms(String a, String Adults, WebDriver driver, int fi, int si) {
			
			if(Integer.parseInt(Adults) <= Integer.parseInt(a)) {
				while(!Adults.equals(a)) {
					int b = Integer.parseInt(a);
					b--;
					a = Integer.toString(b);
					driver.findElement(By.xpath("(//div[@class='pointer minus-sign-wrapper'])["+fi+"]")).click();
						
				}
			}else if(Integer.parseInt(Adults) >= Integer.parseInt(a)) {
				while(!Adults.equals(a)) {
					int b = Integer.parseInt(a);
					b++;
					a = Integer.toString(b);
					driver.findElement(By.xpath("(//div[@class='pointer plus-sign-wrapper'])["+si+"]")).click();
				}
			}			
		}
	
	@Test
	public void Test_Shivam() throws Throwable{
		
		//WebDriver driver = CommonUtils.setSeleniumGrid();
		
		WebDriver driver = new ChromeDriver();
		
		// get the URL
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Maximum window
		driver.manage().window().maximize();
	
		// Close the login pop up
		try {
			driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		}catch (Exception e) {
			// TODO: handle exception
		}
		// Holiday Package
		driver.findElement(By.xpath("//li[@class='menu_Holidays removeItemMargin']")).click();
		
		// From City
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter City']")).clear();
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("document.querySelector('.citypicker_list').scrollTop=1000");
		
		driver.findElement(By.xpath("//li[@data-testid='Bangalore']")).click();
		
		
		
		// TO City
		driver.findElement(By.xpath("//label[@for='toCity']")).click();
		
		// Pop Up Code
		try {
			driver.findElement(By.xpath("//p[text()='Cancel']"));
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		Thread.sleep(1000);
		
		try {
			driver.findElement(By.xpath("//p[text()='Cancel']"));
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Goa");
		
		// pop up code
		try {
			driver.findElement(By.xpath("//p[text()='Cancel']"));
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		// driver.navigate().refresh();
		
		
		
		// Date button Click
		driver.findElement(By.xpath("//p[@class='empty-date-text']")).click();
		
		
		String s1 = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
		
		Calender.calender1(s1, driver, date, month);

		// add the guests try catch block
		
		
		// Rooms and Guests
		driver.findElement(By.xpath("//p[contains(text(),'Select Rooms')]")).click();
		
		try {
			driver.findElement(By.xpath("//button[@class='addButton']")).click();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		String adultnumber = driver.findElement(By.xpath("(//span[@class='font22 darkText latoMedium'])[1]")).getText();
		Thread.sleep(3000);
		String numberWithoutLeadingZeros = adultnumber.replaceFirst("^0+(?!$)", "");
		// System.out.println("Print here ..." +numberWithoutLeadingZeros);
		
		GuestsAndRooms(numberWithoutLeadingZeros, Adults, driver, 1, 1);
		
		// driver.findElement(By.xpath("(//div[@class='pointer plus-sign-wrapper'])[1]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'APPLY')]")).click();
		
		driver.findElement(By.xpath("//button[@id='search_button']")).click();
		
		

		try {
			driver.findElement(By.xpath("//span[@class='closeIcon']")).click();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		try {
			driver.findElement(By.xpath("//div[@class='intervention-close']")).click();
		}catch (Exception e) {
			// TODO: handle exception
		}		
		
		// Create an instance of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down the page by 1000 pixels
        js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("(//div[@class='filterListLeft'])[1]")).click();
		
		Thread.sleep(2000);
		 // Create an instance of JavascriptExecutor

        // Scroll down by a specific number of pixels (e.g., 1000 pixels)
        // js.executeScript("window.scrollBy(0, 500)");

        // Hotel rating
//        
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//	        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='hotelCategorySection']//span[@class='categoryRating  ']")));
//	        element.click();
//        
		
			
		
		driver.findElement(By.xpath("(//div[@class='imageCardWrapper'])[1]")).click();
		try {
			
		      driver.findElement(By.xpath("//div[@class=\"variant-card-container  pointer\"]")).click();
			}catch (Exception e) {
				// TODO: handle exception
		}
		
		try {
			driver.findElement(By.xpath("//div[@class='intervention-close']")).click();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		Set<String> windows = driver.getWindowHandles(); // [parentid, childid]
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId); // switch to child
		
		//System.out.println(driver.getTitle());
		
		// pop up
				try {
					driver.findElement(By.xpath("//button[@class='skipBtn']")).click();
				}catch (Exception e) {
					// TODO: handle exception
				}
		
		driver.findElement(By.xpath("//div[@id='continue']")).click();
		

        // Scroll down the page by 1000 pixels
        js.executeScript("window.scrollBy(0,1000)");
			
		// Email
		driver.findElement(By.xpath("//input[@name='EMAIL']")).sendKeys("shivamkhatkale@gmail.com");
		
		// 91
		driver.findElement(By.xpath("//input[@id='react-select-2-input']")).sendKeys("91");
		
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
		
		// Mobile number
		driver.findElement(By.xpath("//input[@name='MOBILE_NUMBER']")).sendKeys("8433696915");
		
		// City
		driver.findElement(By.xpath("//input[@name='CITY']")).sendKeys("Mumbai");
		
		//GST State
		driver.findElement(By.xpath("//input[@id='react-select-3-input']")).sendKeys("maha");

		actions.sendKeys(Keys.ENTER).build().perform();
		
		driver.findElement(By.xpath("//input[@name='ADDRESS']")).sendKeys("306 Sai Aaryan Panvel");
		
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0, -800);");
		
		// Add Traveller
		
		
		driver.findElement(By.xpath("//p[text()='Add Traveller'][1]")).click();
		
		
		// Data
		Calender.AddTraveller(driver);
		js.executeScript("window.scrollBy(0, 400);");

		try {
			driver.findElement(By.xpath("//span[@class='close']")).click();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		actions.moveToElement(driver.findElement(By.xpath("//div[@id='proceedToPaymentDiv']"))).build().perform();
		
		// Proceed to Payment
		//findElement(By.xpath("//div[@id='proceedToPaymentDiv']")).click();
		driver.findElement(By.xpath("//span[text()='Proceed To Payments']")).click();
		
		driver.findElement(By.xpath("//div[@class='continueTxt']")).click();

		System.out.println("Test 3 Passed Successfully...");

		Thread.sleep(3000);


		driver.quit();
		
	}

}
