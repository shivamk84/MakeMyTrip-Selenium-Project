package Project;

import java.time.Duration;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_6 {
	
	
	@Test
	public void Cabs_Gopal() throws Throwable{
	
		

		Random rand = new Random();
		int n = rand.nextInt(5000,10000);
		int n1= rand.nextInt(1000,3000);
		SoftAssert st=new SoftAssert();

		
		WebDriver driver = CommonUtils.Calling_1();
		
		//Selecting the from location
		//close popup
		Thread.sleep(n);
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/div/section/span")).click();
		Thread.sleep(n1);
		//Navigate to cabs
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[7]/span/a/span[1]/span")).click();
		Thread.sleep(n1);
		//click on "FROM" location
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div[2]/div[1]/div[1]/label")).click();
		Thread.sleep(n1);
		//Type the location of departure
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Chennai");
		Thread.sleep(n1);
		//Click on confirmed location 
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]")).click();
		Thread.sleep(n1);
		//Enter the "TO" location
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("Bhubaneswar");
		Thread.sleep(n1);
		//click on confirmed "TO" location
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/p/span")).click();
		Thread.sleep(n1);
		//Go to date selection
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div[2]/div[1]/div[3]/label")).click();
		Thread.sleep(n1);
		//select the date
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[5]")).click();
		Thread.sleep(n1);
		//select time
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div[2]/div[1]/div[5]/label")).click();
		Thread.sleep(n1);
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div[2]/ul[1]/li[12]/span")).click();
		Thread.sleep(n1);
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div[2]/ul[2]/li[7]/span")).click();
		Thread.sleep(n1);
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div[1]/div[5]/span")).click();
		Thread.sleep(n1);
		//Click search
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div/div[2]/p/a")).click();
		Thread.sleep(n);
		//click on book now
		driver.findElement(By.xpath("//*[@id=\"List\"]/div[1]/div/div[3]/div/a/span")).click();
		Thread.sleep(n1);
		//click on pick up address
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[5]/div/div[1]/div[1]/div/input")).click();
		Thread.sleep(n1);
		//Fill pick up address
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[5]/div/div[1]/div[1]/div/div/div[1]/div/input")).sendKeys("Chennai");
		Thread.sleep(n1);
		//click on desired pick up address
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-1\"]")).click();
		Thread.sleep(n1);
		//Click on drop address
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[5]/div/div[1]/div[2]/div/input")).click();
		Thread.sleep(n1);
		//Fill send address
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[5]/div/div[1]/div[2]/div/div/div[1]/div/input")).sendKeys("Kalinga nagar");
		Thread.sleep(n1);
		//Click on desired drop address
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]")).click();
		Thread.sleep(n1);
		//click on name
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[5]/div/div[2]/div[1]/div[1]/input")).click();
		Thread.sleep(n1);
		//Enter name
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[5]/div/div[2]/div[1]/div[1]/input")).sendKeys("Gopal Sahu");
		Thread.sleep(n1);
		//click on email
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[5]/div/div[2]/div[2]/div[1]/div/input")).click();
		Thread.sleep(n1);
		//enter email
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[5]/div/div[2]/div[2]/div[1]/div/input")).sendKeys("gopal.sahum3@gmail.com");
		Thread.sleep(n1);
		//Select gender
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[5]/div/div[2]/div[1]/div[2]/div/span[1]/div")).click();
		Thread.sleep(n1);
		//Click on number
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[5]/div/div[2]/div[2]/div[2]/div/input[2]")).click();
		Thread.sleep(n1);
		//Enter number
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/div[5]/div/div[2]/div[2]/div[2]/div/input[2]")).sendKeys("8249689665");
		Thread.sleep(n1);
		//Close
		
		driver.findElement(By.xpath("//div[@class='cabPaymentCont']")).click();
		
		System.out.println("Test 6 Passed Successfully...");
		
		driver.quit();
		
		
	}
}
