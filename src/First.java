import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class First {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramesh\\eclipse-workspace\\Launch\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame(1);
		WebElement aa = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		driver.switchTo().frame(1);
		aa.sendKeys("5896");
		WebElement ac = driver.findElement(By.xpath("//img[@src=\"/gif/continue_new1.gif?v=1\"]"));
		ac.click();
		}
		
		
	}


