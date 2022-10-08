package pom.automation.co;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_mystore {
public static WebDriver driver;
public login_mystore(WebDriver driver2) {
	 this.driver=driver2;
	 PageFactory.initElements(driver, this);
	 }
@FindBy(xpath="//input[@id='email']")
private WebElement mailid;
@FindBy(xpath="//input[@id='passwd']")
private WebElement password;
@FindBy(xpath="//i[normalize-space(text()='Sign in') and @class='icon-lock left']")
private WebElement login;
@FindBy(xpath="//a[@class='login']")
private WebElement ologin;


@FindBy(xpath="//a[@class='logout']")
private WebElement ologout;

public WebElement getOlogin() {
	return ologin;
}
public WebElement getOlogout() {
	return ologout;
}
public WebElement getMailid() {
	return mailid;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}

}
