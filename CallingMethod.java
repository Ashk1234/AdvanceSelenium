package Demo;

import SapnaWebDriver.ReusableMethod;

public class CallingMethod {

	public static void main(String[] args) {
		ReusableMethod a=new ReusableMethod();
		a.AppLaunch("https://mail.rediff.com/cgi-bin/login.cgi");
		a.ElementPresent("login1");
		a.ElementPresent("password");
		System.out.println("Hello");
		a.AppClose();

	}

}
