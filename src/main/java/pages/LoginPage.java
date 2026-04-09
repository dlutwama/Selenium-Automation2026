package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	private By usernameTextBox = By.id("Email");
	private By passwordTexBbox = By.id("Password");
	private By loginButton = By.xpath("/html/body/div/div/div[2]/div[1]/div/div[2]/form/div[3]/button");
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(usernameTextBox).clear();
		driver.findElement(usernameTextBox).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordTexBbox).clear();
		driver.findElement(passwordTexBbox).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	
}
