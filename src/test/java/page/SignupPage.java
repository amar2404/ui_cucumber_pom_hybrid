package page;

import org.openqa.selenium.WebDriver;
import base.UserActions;

public class SignupPage extends UserActions {
	
	static String txtEmail = "#email";
	static String txtFirstName = "#firstName";
	static String txtLastName = "#lastName";
	static String txtPhone = "#phone";
	static String txtPassword = "#password";
	static String txtConfirmPassword = "#confirmPassword";
	static String chkTermCondition = "#tnc";
	static String btncreateAccount = "#create-account-btn";

	public static void createUser(WebDriver driver, String email, String FName, String LName, String password,String phone ) throws InterruptedException
	{	
		base.UserActions.enter(driver, txtEmail, email);
		base.UserActions.enter(driver, txtFirstName, FName);
		base.UserActions.enter(driver, txtLastName, LName);
		base.UserActions.enter(driver, txtPhone, phone);
		base.UserActions.enter(driver, txtPassword, password);
		base.UserActions.enter(driver, txtConfirmPassword, password);
		base.UserActions.scrollDown(driver);

		Thread.sleep(5000);
		base.UserActions.click(driver, btncreateAccount);
		
	}
	
}
