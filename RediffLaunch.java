package Demo;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLaunch {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashk1234\\Desktop\\Framework\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://makemysushi.com/Sushi-share/contact-us");
        driver.manage().window().maximize();
        String Expected_Text="Thank you for getting in touch";
      String Actual_Text= driver.findElement(By.xpath("//*[text()='Thank oyu for getting in touch']")).getText();
      
      if(Actual_Text.equals(Expected_Text))
      {
    	  System.out.println(Expected_Text);
      }
      
      else
      {
    	  System.out.println(Actual_Text);
    	  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  		FileUtils.copyFile(f, new File("C:\\Users\\ashk1234\\Desktop\\Framework\\Test ResultDeepika.png"));
      }
    	  
        driver.close();
	}

}
