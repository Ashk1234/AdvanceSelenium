package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {
public void method()
{
	
}
	public static void main(String[] args) throws Exception {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashk1234\\Desktop\\Framework\\jar\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://docs.oracle.com/javase/8/docs/api/");
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	      WebElement f1= driver.findElement(By.name("packageListFrame"));
	      driver.switchTo().frame(f1).findElement(By.xpath("/html/body/div[2]/ul/li[2]/a")).click();
	      driver.switchTo().defaultContent();
	      Thread.sleep(8000);
	     WebElement f2= driver.findElement(By.name("packageFrame"));
	     driver.switchTo().frame(f2).findElement(By.xpath("/html/body/div/ul[1]/li[2]/a/span")).click();
	     driver.switchTo().defaultContent();
	     Thread.sleep(8000);
	     List<WebElement> No_of_iFrame=driver.findElements(By.tagName("frame"));
	       System.out.println("No of iFrame is " + No_of_iFrame.size());
	       
	      WebElement f3= driver.findElement(By.name("classFrame"));
	       String text=driver.switchTo().frame(f3).findElement(By.xpath("//*[@title='Interface Adjustable']")).getText();
	       System.out.println(text);
	       driver.close();

	}

}
