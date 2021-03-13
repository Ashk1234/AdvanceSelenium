package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InfinteLooping {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashk1234\\Desktop\\Framework\\jar\\chromedriver.exe");
	  
	   int a=-1;
	   for(int i=0; i>a; i++)
	   {
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://youtube.com");
		   driver.manage().window().maximize();
		  boolean b=driver.findElement(By.xpath("//*[@id='button']")).isDisplayed();
		   if(b==true)
		   {
			 driver.findElement(By.xpath("//*[@id='button']")).click();
			 Thread.sleep(5000);
			   driver.findElement(By.xpath("//*[@id='introAgreeButton']")).click();
			   driver.close();
			   System.out.println("Application launch on " + i + " Time");
		   }
		   else
		   {
			   driver.close();
			   System.out.println("Application launch on " + i + " Time");  
		   }
		  
		   
	   }
	}

}
