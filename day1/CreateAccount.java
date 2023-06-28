package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		driver.findElement(By.xpath("(//a[contains(text(),'Accounts')])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		driver.findElement(By.xpath("//td[@class='titleCell']/following::input[@id='accountName']"))
		.sendKeys(" Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.name("groupNameLocal")).sendKeys("Test");
		driver.findElement(By.name("officeSiteName")).sendKeys("Leaf");
		driver.findElement(By.xpath("//td[@class='titleCell']/following::input[@id='annualRevenue']")).
		sendKeys("2 crore");
		WebElement elememt = driver.findElement(By.name("industryEnumId"));
		Select option1 = new Select(elememt);
		option1.selectByValue("IND_HARDWARE");
		WebElement elememt2 = driver.findElement(By.name("ownershipEnumId"));
		Select option2 = new Select(elememt2);
		option2.selectByVisibleText("S-Corporation");

		WebElement elememt3 = driver.findElement(By.name("dataSourceId"));
		Select option3= new Select(elememt3);
		option3.selectByValue("LEAD_EMPLOYEE");

		WebElement elememt4 = driver.findElement(By.name("marketingCampaignId"));
		Select option4 = new Select(elememt4);
		option4.selectByIndex(2);

		WebElement elememt5 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select option5 = new Select(elememt5);
		option5.selectByValue("TX");

		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
















	}

}
