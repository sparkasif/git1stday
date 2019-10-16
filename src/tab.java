import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tab {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\selle\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		List<WebElement> trows = driver.findElements(By.tagName("tr"));
		
		for(int i=0;i<trows.size();i++)
		{
			if(i%2==0)
			{
				WebElement trow = trows.get(i);
				List<WebElement> tdata =trow.findElements(By.tagName("td"));
				for(int j=0;j<tdata.size();j++)
				{
					WebElement tdat = tdata.get(j);
					String text = tdat.getText();
					if(text.equals("Dubai"))
					{
						WebElement c = driver.findElement(By.xpath("(//a[text()='details'])[1]"));
						c.click();
					}
					System.out.println(text);
				}
			}
			
			
		}

		
		
	}
	
	
	
	

}
