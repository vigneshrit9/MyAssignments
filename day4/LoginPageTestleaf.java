package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPageTestleaf {
	public static void main(String[] args) throws InterruptedException {
	    ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vignesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raju");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vigneshrit9@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7010407945");
		Thread.sleep(1000);
		driver.findElement(By.name("submitButton")).click();
		driver.close();
		
	}

}
