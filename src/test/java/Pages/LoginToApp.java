package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginToApp extends TestBase  {
	
	
	@FindBy(id="login2")
	WebElement clkLgnBtn;
	
	@FindBy(id="loginusername")
	WebElement UserName;
	
	@FindBy(id="loginpassword")
	WebElement pass;
	
	@FindBy(xpath="//button[normalize-space()='Log in']")
	WebElement Button;
	
	public LoginToApp() {
		PageFactory.initElements(driver, this);
	}
	public void LoginButton() {
		clkLgnBtn.click();
			
	}
	public void username() {
		UserName.sendKeys("sakshib");
    }
	public void Password() {
		pass.sendKeys("Password@2");
   }
	public void Lbutton() {
		Button.click();
		
			
	}
}


