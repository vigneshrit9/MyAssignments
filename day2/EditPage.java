package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ChromeDriver driver  = new ChromeDriver();    
		driver.manage().window().maximize();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//div[@class='x-panel-header']/following::a[contains(text(),'Create')]")).click();
		driver.findElement(By.xpath("//span[@class='x-panel-header-text']/preceding::a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'Find Leads')]/preceding::input[@name='firstName'])[3]"))
		.sendKeys("Vignesh");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[contains(text(),'11191')])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		WebElement findElement = driver.findElement(By.id("updateLeadForm_companyName"));
		findElement.clear();
		WebElement findElement2 = driver.findElement(By.id("updateLeadForm_companyName"));
		findElement2.sendKeys("ACCENTURE");
		driver.findElement(By.xpath("//textarea[@name='importantNote']/following::input[1]")).click();
		if (findElement2.equals(findElement2)) {
			System.out.println("Company name updated successfully");
			
		}else {
			System.out.println("Company name does changed");
		}
		
		driver.close();
		
	}

}
