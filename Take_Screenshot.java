package Demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_Screenshot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashk1234\\Desktop\\Framework\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://makemysushi.com/Sushi-share/contact-us");
		driver.manage().window().maximize();
		String Actual_Result=driver.findElement(By.xpath("//*[text()='Thank oyu for getting in touch']")).getText();
		String Expected_Result="Thank you for getting in touch";
		if(Actual_Result.equals(Expected_Result))
		{
			System.out.println("Expected Result is" + Expected_Result);
		}
		else
		{
			System.out.println("Actual Result is" + Actual_Result);
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("C:\\Users\\ashk1234\\Desktop\\Framework\\Test Result\\text.png"));
					
		}
		driver.close();

	}

}
