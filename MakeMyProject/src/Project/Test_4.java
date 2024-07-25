package Project;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test_4{
	
	@Test
	public void Test_Rijul() throws InterruptedException {
        // Setup FirefoxDriver using WebDriverManager
        // WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new ChromeDriver();
        // Open home page
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        // Create an instance of WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait for the login popup close button and close it
        WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='commonModal__close']")));
        closeButton.click();
        // Click on the train icon
        WebElement trainIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chTrains inactive']")));
        trainIcon.click();
        // Click on the "From" dropdown and enter "Kolkata"
        WebElement fromDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-cy='RailSearchWidget_338']")));
        fromDropdown.click();
        WebElement fromInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='From']")));
        fromInput.click();
        fromInput.sendKeys("Kolkata");
        // Wait for and select Bangalore Junction from the auto-suggestion
        WebElement fromSuggestion = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='react-autowhatever-1-section-0-item-1']")));
        fromSuggestion.click();
        // Click on the "To" dropdown and enter the destination
        WebElement toDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-cy='RailSearchWidget_339']")));
        toDropdown.click();
        WebElement toInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='To']")));
        toInput.click();
        toInput.sendKeys("Delhi");
        // Wait for and select Delhi from the auto-suggestion
        WebElement toSuggestion = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']")));
        toSuggestion.click();
        // Click on the date picker and select a date (adjust XPath as needed)
//        WebElement datePicker = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='travelDate']")));
//        datePicker.click();
        // Click on Class of train dropdown and select a class
        WebElement trainClassDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='code latoBlack font32 blackText makeRelative']")));
        trainClassDropdown.click();
        WebElement trainClass = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='First AC']")));
        trainClass.click();
        // Click the search button
        WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn']")));
        searchButton.click();
        /* next page */
        //select Filter : Available
        WebElement availButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='quickFilter-AC']")));
        availButton.click();
        //select Ticket Types: Free Cancellation
        WebElement ticketType = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='ticketTypeFilter-freeCancellation']")));
        scrollToElementAndClick(driver, ticketType);
        //select Journey Filter: 3 tier AC
        WebElement journeyFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='journeyClassFilter-3A']")));
        scrollToElementAndClick(driver, journeyFilter);
        //select a date in future
        WebElement dateSelect = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='splDayItem'])[5]")));
        scrollToElementAndClick(driver,dateSelect);
        //select a train
        WebElement train = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='train_options_30-07-2024_0']")));
        scrollToElementAndClick(driver,train);
        //click ok on popup :
        WebElement popup = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='latoBold font16 deepskyBlueText textRight appendTop100 pointerCursor']")));
        scrollToElementAndClick(driver,popup);
        //enter email
        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='contactEmail']")));
        scrollToElementAndClick(driver,email);
        email.sendKeys("rijul228@gmail.com");
        //enter mobile number
        WebElement phone = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='mobileNumber']")));
        scrollToElementAndClick(driver,phone);
        phone.sendKeys("8368332763");
        // click on pay now button
        WebElement payNow = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='paymentBtnWrapper makeFlex column']")));
        scrollToElementAndClick(driver,payNow);
        //click on add traveller
        WebElement addTraveller = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='makeFlex spaceBetween hrtlCenter']")));
        scrollToElementAndClick(driver,addTraveller);
        //enter name
        WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='name']")));
        scrollToElementAndClick(driver,name);
        name.sendKeys("rijul");
        //enter age
        WebElement age = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='age']")));
        scrollToElementAndClick(driver,age);
        age.sendKeys("21");
        Thread.sleep(200);
        // Click on gender dropdown and select gender
        driver.findElement(By.xpath("(//div[@class='selectedQuotaContainer noSelection makeRelative'])[1]")).click();
        driver.findElement(By.xpath("//div[contains(@class,'formField genderField makeFlex column appendRight20')]//li[2]")).click();
      driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();	
      //click traveller checkbox :
      WebElement TravCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='makeFlex flexOne column'])[1]")));
      TravCheckbox.click();
      //scrollToElementAndClick(driver,TravCheckbox);
      //enter irctc username
      WebElement IrctcUsername = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='irctcUserName']")));
      IrctcUsername.click();
      //enter irctc username popup
      driver.findElement(By.xpath("//input[@id='IRCTCUserName']")).sendKeys("rijul");
      //click submit button
      driver.findElement(By.xpath("//button[@class=' noShrink appendTop20 appendLeft20']")).click();
      Thread.sleep(1000);
      driver.navigate().refresh();
      // radio button
      driver.findElement(By.xpath("(//div[@class='radioOuter'])[2]")).click();
    //click traveller checkbox :
      WebElement TravCheckbo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='makeFlex flexOne column'])[1]")));
      TravCheckbo.click();
      // Checkbox Your State
      driver.findElement(By.xpath("//div[@class='checkboxWithLblWpr']")).click();
      //click pay now
      driver.findElement(By.xpath("//div[@class='paymentBtnWrapper makeFlex column']")).click();
    
      System.out.println("Test 4 Passed Successfully...");
      
      Thread.sleep(3000);
      
      driver.quit();
	
	}
    private static void scrollToElementAndClick(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }
}