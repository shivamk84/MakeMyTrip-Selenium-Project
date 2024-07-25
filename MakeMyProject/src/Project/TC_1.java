package Project;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_1 {

    @Test
    public void Isha_Test() throws Throwable {
      

        WebDriver driver = new EdgeDriver();
        
        // Open home page
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        
        // Create an instance of WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Wait for the login pop up close button and close it
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='commonModal__close']"))).click();
        
        // Click on the hotel icon
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-cy='menu_Hotels']"))).click();
        
        // Click on the "Location" drop down and enter "Delhi"
        WebElement locDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='city']")));
        locDropdown.click();
        
        WebElement locInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Where do you want to stay?']")));
        locInput.click();
        locInput.sendKeys("Delhi");
        
        // Wait for suggestions and select Delhi from the auto-suggestion
        WebElement locSuggestion = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']")));
        locSuggestion.click();
        Thread.sleep(200);
        
        // Select Check-In date as 30th July
        driver.findElement(By.id("checkin")).click();
        driver.findElement(By.xpath("//div[@class='hsw_inner']/div[2]")).click();
        driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected']")).click();
        
        // Click on the room and guest
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='top-banner']/div[2]/div/div[1]/div[2]/div/div[1]/div[5]"))).click();
        Thread.sleep(200);
        
        // Select the price range
        WebElement fromSuggestion1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='top-banner']/div[2]/div/div[1]/div[2]/div/div[1]/div[5]/div[1]/ul/li[3]")));
        fromSuggestion1.click();
        Thread.sleep(200);
        
        // Click on search
        WebElement searchBtn = driver.findElement(By.xpath("//button[@data-cy='submit']"));
        searchBtn.click();
        Thread.sleep(200);
        
        // Check the Breakfast Included check box
        WebElement breakfastIncluded = driver.findElement(By.xpath("(//span[@class='checkmarkOuter'])[3]"));
        breakfastIncluded.click();
        Thread.sleep(2000);
      
        // Click on the first hotel suggestion
        driver.findElement(By.xpath("(//div[@class='flexOne appendLeft20'])[1]")).click();    
        
        // Switch the tab 
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow); 
        Thread.sleep(2000);
        
        // Create an instance of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        
        Thread.sleep(2000);
        
        // Click on book the hotel
        driver.findElement(By.xpath("//button[text()='BOOK THIS NOW']")).click();
        
        // Wait until the first name input field is present
        WebElement firstNameInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("fName")));
        Thread.sleep(2000);

        // Clear the field and send the desired first name
        firstNameInput.clear();
        firstNameInput.sendKeys("Esha");
        Thread.sleep(2000);
        
        // Fill in the last name field
        WebElement lastNameInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("lName")));
        lastNameInput.clear();
        lastNameInput.sendKeys("Kumbhare");
        Thread.sleep(2000);

        // Fill in the email field
        WebElement emailInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
        emailInput.clear();
        emailInput.sendKeys("eshakumbhare@gmail.com");
        Thread.sleep(2000);

        // Fill in the mobile number field
        WebElement mobileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mNo")));
        mobileInput.clear();
        mobileInput.sendKeys("9146993214");
        Thread.sleep(2000);
        
        try {
            driver.findElement(By.xpath("//div[@class='checkboxWithLblWpr__checkboxCtr']")).click();
        } catch (Exception e) {
            // Handle exception
        }
        
        // Click on Pay Now
        WebElement bookBtn1 = driver.findElement(By.xpath("//a[text()='Pay Now']"));
        bookBtn1.click();
        Thread.sleep(2000);

        // Fill in the upi id field
        WebElement upiField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("inputVpa")));
        upiField.clear();
        upiField.sendKeys("eshakumbhare@oksbi");
        
        System.out.println("Test 1 Passed Successfully...");
        driver.quit();
    }
}
