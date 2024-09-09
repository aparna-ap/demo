package signupfbpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Signupwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver  driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.facebook.com/signup");
	     driver.findElement(By.name("firstname")).sendKeys("Aparna");
	     driver.findElement(By.name("lastname")).sendKeys("Rajeevan");
	     driver.findElement(By.name("reg_email__")).sendKeys("9562860637");
	     driver.findElement(By.name("reg_passwd__")).sendKeys("123456789aps");
	     Select day= new Select(driver.findElement(By.name("birthday_day")));
	     Select month= new Select(driver.findElement(By.name("birthday_month")));
	     Select year = new Select(driver.findElement(By.name("birthday_year")));
	     day.selectByIndex(2);
	     month.selectByValue("9");
	     year.selectByVisibleText("2000");
	     driver.findElement(By.name("sex")).click();
	     driver.findElement(By.name("websubmit")).click();

	}

}
