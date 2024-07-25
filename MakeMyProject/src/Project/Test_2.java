package Project;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Test_2 {
    static String date = "28";
    static String month = "September 2024";
    
  @Test
  public void test_Varun() throws InterruptedException { 
          
        // TODO Auto-generated method stub
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
        driver.findElement(By.xpath("(//a[@class='headerIcons makeFlex hrtlCenter column'])[2]")).click();
        
        Thread.sleep(1000);
        // Booking Tab
        driver.findElement(By.xpath("//div[@class='hsw_inputBox selectHtlCity']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Where do you want to stay?']")).sendKeys("pawna");
        Thread.sleep(1500);
        
        // Select City
        driver.findElement(By.xpath("(//div[@class='clickable'])[1]")).click();
        
        Thread.sleep(1500);
        // Date Selection
        driver.findElement(By.xpath("//div[@class='hsw_inner']/div[2]")).click();
        driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--start DayPicker-Day--selected']")).click();
        
        // JS Executer
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[2]")).click();
        
        Thread.sleep(1500);
        // Gender
        driver.findElement(By.xpath("(//div[@class='gstSlct'])[2]")).click();
        
        driver.findElement(By.xpath("//ul[@class='gstSlct__list']/li[2]")).click();
        jse.executeScript("window.scrollBy(0,300)");
        driver.findElement(By.xpath("//span[@data-testid='child_count']")).click();
        
        Thread.sleep(2000);
        jse.executeScript("window.scrollBy(0,100)");
        driver.findElement(By.xpath("//ul[@class='gstSlct__list']//li[3]")).click();
        
        // Button
        WebElement btn =driver.findElement(By.xpath("//button[@class='primaryBtn btnApplyNew pushRight capText']"));
        Actions a = new Actions(driver);
        a.moveToElement(btn);
        btn.click();
        Thread.sleep(1500);
        // Rate
        driver.findElement(By.xpath("//div[@class='hsw_inputBox travelFor']")).click();
        driver.findElement(By.xpath("//li[contains(text(),'₹1500-₹2500')]")).click();
        
        Thread.sleep(1500);
        // Search
        driver.findElement(By.id("hsw_search_button")).click();
        jse.executeScript("window.scrollBy(0,400)");
        
        Thread.sleep(1500);
        // Sidebar Filter
        driver.findElement(By.xpath("//span[text()='Free Breakfast']")).click();
        jse.executeScript("window.scrollBy(0,800)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='BEDROOM_COUNT']//li[1]//span[1]//label[1]")).click();
        Thread.sleep(1500);
        //Section Selection
        driver.findElement(By.xpath("(//div[@class='flexOne makeFlex'])[1]")).click();
                
        Thread.sleep(3000);
        
        //Switch Windows
        Set<String> windows = driver.getWindowHandles(); // [parentid, childid]
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        jse.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[text()='BOOK THIS NOW']")).click();
        
        Thread.sleep(1500);
        //Fill Data
        driver.findElement(By.id("fName")).sendKeys("Varun");
        driver.findElement(By.id("lName")).sendKeys("Mohata");
        driver.findElement(By.id("email")).sendKeys("varun07mohata@gmail.com");
        driver.findElement(By.id("mNo")).sendKeys("7083860434");
        
        Thread.sleep(1500);
        //Choose State
        driver.findElement(By.id("dt_state_gst_info")).click();
        driver.findElement(By.xpath("//li[normalize-space()='Maharashtra']")).click();
        driver.findElement(By.xpath("//span[contains(@class,'checkboxWpr')]//b")).click();
        
        Thread.sleep(1500);
        //PayNow
        driver.findElement(By.xpath("//a[normalize-space()='Pay Now']")).click();
        
        Thread.sleep(2000);
        
        System.out.println("Test 2 Passed Successfully...");
        
        driver.quit();
        
    }
}