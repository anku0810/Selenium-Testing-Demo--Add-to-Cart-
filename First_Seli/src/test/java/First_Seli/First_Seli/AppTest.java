
// Amazon Search the product 

package First_Seli.First_Seli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
public class AppTest{
	public static void main(String[] args) {
		System.setProperty("selenuim.chrome.webdriver", "C:\\Users\\Ankit\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromdriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in");

		WebElement l = driver.findElement(By.id("twotabsearchtextbox"));
		l.sendKeys("Realme 11 Pro");
		WebElement b = driver.findElement(By.id("nav-search-submit-button"));
		b.click();
		
		//driver.navigate().to("https://accounts.google.com/signin");
		//driver.manage().window().maximize();
		
	}
}