import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramesh\\eclipse-workspace\\Launch\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions acc=new Actions(driver);
		driver.get("https://www.amazon.in/");
	WebElement mouse = driver.findElement(By.id("nav-link-shopall"));
	acc.moveToElement(mouse).perform();
	WebElement mouse32 = driver.findElement(By.xpath("(//span[@class=\"nav-text\"])[10]"));
	acc.moveToElement(mouse32).perform();;
	}
	

}
