package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver  = new ChromeDriver();    
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569678%7Cb%7Cfacebook%20com%20%23%7C&placement=&creative=589460569678&keyword=facebook%20com%20%23&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221352%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-498889442776%26loc_physical_ms%3D9040217%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid="
				+ "Cj0KCQjw7uSkBhDGARIsAMCZNJtrxZ1B2-iBs9B0FyuI5w4BCPoIV_en5lEOwnUXYVv_f7Zk_gLrEYIaAvtnEALw_wcB");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("firstname")).sendKeys("vignesh");
		driver.findElement(By.name("lastname")).sendKeys("Raju");
		driver.findElement(By.xpath("(//input[contains(@class,'input')])[3]")).sendKeys("9078787878");
		driver.findElement(By.id("password_step_input")).sendKeys("filemanager@12");
		WebElement findElement1 = driver.findElement(By.name("birthday_day"));
		Select options = new Select(findElement1);
		options.selectByValue("2");
		WebElement findElement2 = driver.findElement(By.name("birthday_month"));
		Select options2 = new Select(findElement2);
		options2.selectByIndex(3);
		WebElement findElement3 = driver.findElement(By.name("birthday_year"));
		Select options3 = new Select(findElement3);
		options3.selectByIndex(17);
		driver.findElement(By.xpath("(//input[contains(@name,'sex')])[2]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'Sign U')])[1]")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		
		if (title.equals(title2)) {
			System.out.println("Account created successfully");
		}else {
				System.out.println("Account creation was failure");
			
			}
				
			
		}
		
		

	}


