import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\selle\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.snapdeal.com");
		
		WebElement sb = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		sb.sendKeys("mi band3");
		
		
		
		WebElement s = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		s.click();
		
		
		WebElement pro = driver.findElement(By.xpath("(//p[@class='product-title'])[2]"));
		pro.click();
		
		Thread.sleep(5000);
		
		String s1 = driver.getWindowHandle();
		
		Set<String> all = driver.getWindowHandles();
		
		System.out.println("s1");
		System.out.println("all");
		
		for (String x : all) {
			
			if(!s1.equals(x)) {
			
			driver.switchTo().window(x);
			
		}}
		
		WebElement add = driver.findElement(By.xpath("//span[text()='add to cart']"));
		add.click();
		
		
		
		
	}
}
