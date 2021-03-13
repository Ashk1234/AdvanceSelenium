package Demo;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchApplication {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashk1234\\Desktop\\Framework\\jar\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
		
		
	}

}
