package Project;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Calender {

	// Calender
	public static void calender1(String sl, WebDriver driver, String date, String month) throws InterruptedException {

		while (!month.equals(sl)) {
			Thread.sleep(2000);

			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			sl = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
			
		}

		List<WebElement> dates = driver.findElements(By.xpath("(//div[@class='DayPicker-Month'])[1]//div[@class='DayPicker-Day']//div//p"));

		for (WebElement x : dates) {
			if (x.getText().equals(date)) {
				Actions actions = new Actions(driver);
				actions.moveToElement(x).build().perform();
				x.click();
				break;
			}
		}
	}
	
	public static void AddTraveller(WebDriver driver ) throws InterruptedException {
			
		Actions actions = new Actions(driver);

		 driver.findElement(By.xpath("//input[@name='FIRST_NAME']")).sendKeys("Arshan");
			Thread.sleep(500);
			
			driver.findElement(By.xpath("//input[@name='LAST_NAME']")).sendKeys("Bhanage");
			Thread.sleep(1000);


			driver.findElement(By.xpath("//input[@id='react-select-4-input']")).sendKeys("11");
			actions.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
			

			//driver.findElement(By.xpath("//input[@id='react-select-5-input']")).click();
			
			driver.findElement(By.xpath("//input[@id='react-select-5-input']")).sendKeys("Jan");
			actions.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
			
			//driver.findElement(By.xpath("//input[@id='react-select-5-input']")).click();
			
			driver.findElement(By.xpath("//input[@id='react-select-6-input']")).sendKeys("2001");
			actions.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
			
			
			driver.findElement(By.xpath("//input[@id='react-select-7-input']")).sendKeys("Male");
			actions.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[contains(text(),'Add Traveller')]")).click();
			Thread.sleep(1000);
	
	}
	
}
