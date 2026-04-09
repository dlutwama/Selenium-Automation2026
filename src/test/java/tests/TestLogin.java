package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class TestLogin extends BaseTest {
	
	@Test
	public void testValidLogin() {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername("admin@yourStore.com");
		loginPage.enterPassword("admin");
		loginPage.clickLogin();
		
		System.out.println("Title of the psge is :" +driver.getTitle());
	}
	

}
