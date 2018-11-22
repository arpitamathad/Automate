package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import pages.LoginPage;

public class TestLogin extends BaseTest {

	@Test
	public void Test1(){
		
		LoginPage loginPage = new LoginPage(driver);
		String un = Utility.getXLData(INPUT_PATH, 1, 0);
		System.out.println(un);
		loginPage.setUserName(un);
		Reporter.log(un,true);
		String pw = Utility.getXLData(INPUT_PATH, 1, 1);
		Reporter.log(pw,true);
		loginPage.setPassWord(pw);
		
		loginPage.clickLogin();

	}
}
