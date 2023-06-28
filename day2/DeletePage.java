package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver  = new ChromeDriver();    
		driver.manage().window().maximize();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//form[@id='login']//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//div[@id='form']//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		driver.findElement(By.xpath("//div[@id='__gwtext_hidden']/preceding::a[text()='Leads']")).click();
		driver.findElement(By.xpath("//div[@id='__gwtext_hidden']/preceding::a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//table[@class='x-table-layout']/following::input[39]")).sendKeys("7010407945");
		driver.findElement(By.xpath("//td[@class='x-btn-right']/preceding::button[text()='Find Leads']")).click();
		String caputureText = driver.findElement(By.xpath("//a[text()='12354']")).getText();
		System.out.println("Capured id is  "+caputureText);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='12354']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']/following-sibling::a")).click();
		driver.findElement(By.xpath("//div[@id='__gwtext_hidden']/preceding::a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@class=' x-form-text x-form-field ']")).sendKeys("12354");
		driver.findElement(By.xpath("//td[@class='x-btn-right']/preceding::button[text()='Find Leads']")).click();
		
		if (caputureText.equals("11192")) {
			System.out.println("No records to display");
			
		}else {
			System.out.println("Records found");
		}
		
		
		
		
		

		

	}

}
