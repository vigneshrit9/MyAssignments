package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver  = new ChromeDriver();    
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create L')]")).click();
		WebElement findElement = driver.findElement(By.id("createLeadForm_companyName"));//.sendKeys("TestLeaf");
		findElement.sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("VigneshKumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raju");
		driver.findElement(By.name("firstNameLocal")).sendKeys("viki");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.name("description")).sendKeys("I am a tester");
		driver.findElement(By.name("primaryEmail")).sendKeys("testleafviki@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.className("subMenuButton")).click();
		WebElement findElement2 = driver.findElement(By.id("createLeadForm_companyName"));
		findElement2.clear();
		WebElement findElement3 = driver.findElement(By.id("createLeadForm_companyName"));//.sendKeys("TestLeaf");
		findElement3.sendKeys("CTS");
		WebElement findElement4 = driver.findElement(By.id("createLeadForm_firstName"));
		findElement4.clear();
		WebElement findElement5 = driver.findElement(By.id("createLeadForm_firstName"));
		findElement5.sendKeys("vignesh");
		driver.findElement(By.name("submitButton")).click();
		String title =driver.getTitle();
		System.out.println("page title :"+title);
		
		
		

	}

}
