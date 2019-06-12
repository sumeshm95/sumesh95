

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramesh\\eclipse-workspace\\Launch\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	@AfterClass
	public static void afterClass() {
		driver.quit();
	}
@Before
public void before() {
Date date=new Date();
System.out.println(date);
}
@After
public void after() {
	Date date=new Date();
	System.out.println(date);
}
@Test
public void test() {
WebElement firstname = driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"));
firstname.sendKeys("sumesh");
WebElement lastname = driver.findElement(By.className("form-control ng-pristine ng-untouched ng-invalid ng-invalid-required"));
lastname.sendKeys("m");
WebElement address = driver.findElement(By.className("form-control ng-pristine ng-untouched ng-valid"));
address.sendKeys("lakshmi mills");
WebElement email = driver.findElement(By.className("form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required"));
email.sendKeys("sumeshmgmail.com");
WebElement phone = driver.findElement(By.className("form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern"));
phone.sendKeys("88856988");
WebElement gender = driver.findElement(By.className("ng-pristine ng-untouched ng-invalid ng-invalid-required"));
gender.click();
WebElement hobby = driver.findElement(By.id("checkbox1"));
hobby.click();
WebElement skill = driver.findElement(By.id("Skills"));
Select s =new Select(skill);
s.selectByValue("Android");
WebElement country = driver.findElement(By.id("countries"));
Select s2 =new Select(country);
s2.selectByValue("India");













}



}