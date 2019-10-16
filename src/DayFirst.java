import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayFirst {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selinium1\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Register.html");
	
	WebElement first = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	first.sendKeys("Asif");
	WebElement last = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	last.sendKeys("Iqbal");
	WebElement adrs = driver.findElement(By.xpath("//textarea[@rows='3']"));
	adrs.sendKeys("91,chinnayan colony,perambur,chennai-600015");
	WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
	mail.sendKeys("asifi1405@gmail.com");
	WebElement tele = driver.findElement(By.xpath("//input[@type='tel']"));
	tele.sendKeys("9944216163");
	WebElement gen = driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]"));
	gen.click();
	WebElement hob = driver.findElement(By.xpath("//input[@id='checkbox2']"));
	hob.click();
	WebElement lang = driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']"));
	lang.sendKeys("English");
	
	
	
	
	
	
	
	
	
	
}
}
