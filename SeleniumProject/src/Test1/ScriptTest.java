package Test1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptTest {

	public static void main(String[] args) {
		//INPUT EMAIL HERE//
		String username = "emailhere";
		//INPUT password HERE//
		String password = "password here";
//code
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cps3-\\Downloads\\chromedriverCM\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://todo-list-login.firebaseapp.com/#!/home");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String mainwindow=driver.getWindowHandle();
		driver.findElement(By.linkText("Sign in with github")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator it = handles.iterator();
		String parentid=(String) it.next();
		String childid=(String) it.next();
		driver.switchTo().window(childid);
		driver.findElement(By.cssSelector("#login_field")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(password);
		driver.findElement(By.cssSelector(".btn")).click();
		driver.switchTo().window(parentid);
		int i = 0;
		while( i < 10)
		{
			driver.findElement(By.xpath("//div[2]/div/input")).sendKeys("Hi123");
			driver.findElement(By.xpath("//div[2]/button")).click();
			i = i+1;
		}
		if(i >= 10)
		{
			driver.findElement(By.xpath("//button")).click();
			int truetest = 1;
	if (truetest == 1)
			{
	driver.findElement(By.linkText("Sign in with github")).click();
	int deletetest = 1;
	truetest = 0;
	if (deletetest == 1);
	{
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//li[10]/div/div[2]/button")).click();
	driver.findElement(By.xpath("//li[9]/div/div[2]/button")).click();
	driver.findElement(By.xpath("//li[8]/div/div[2]/button")).click();
	driver.findElement(By.xpath("//li[7]/div/div[2]/button")).click();
	driver.findElement(By.xpath("//li[6]/div/div[2]/button")).click();
	driver.findElement(By.xpath("//li[5]/div/div[2]/button")).click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button")).click();
			}
		}
			}
			}				
	}
 
