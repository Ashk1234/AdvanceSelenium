package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_Image_Count {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashk1234\\Desktop\\Framework\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		List<WebElement> link_count=driver.findElements(By.tagName("a"));
		List<WebElement> img_count=driver.findElements(By.tagName("img"));
		System.out.println("Number of links present is "+link_count.size());
		System.out.println("Number of links present is " +img_count.size());
		int i;
		for(i=0; i<link_count.size();i++)
		{
			System.out.println(link_count.get(i).getText() + "--" + link_count.get(i).getAttribute("href"));
			
		
		}
		driver.close();

	}

}
