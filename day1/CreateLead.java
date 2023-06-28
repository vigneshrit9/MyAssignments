package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver  = new ChromeDriver();    
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//username,password (DemoSalesManager,crmsfa)
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create L')]")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vignesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raju");
		WebElement findElement = driver.findElement(By.name("dataSourceId"));
		Select option = new Select(findElement);
		option.selectByIndex(2);
		WebElement findElement2 = driver.findElement(By.name("marketingCampaignId"));
		Select option2 = new Select(findElement2);
		option2.selectByIndex(2);
		WebElement findElement3 = driver.findElement(By.name("ownershipEnumId"));
		Select option3 = new Select(findElement3);
		option3.selectByValue("OWN_LLC_LLP");
		WebElement findElement4 = driver.findElement(By.name("generalCountryGeoId"));
		Select option4 = new Select(findElement4);
		option4.selectByVisibleText("American Samoa");
		driver.findElement(By.name("submitButton")).click();



	}

}
