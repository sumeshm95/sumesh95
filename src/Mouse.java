import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramesh\\eclipse-workspace\\Launch\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions acc=new Actions(driver);
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement scr = driver.findElement(By.id("credit2"));
WebElement des = driver.findElement(By.id("shoppingCart1"));
acc.dragAndDrop(scr, des).perform();
}
}