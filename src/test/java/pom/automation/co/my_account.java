package pom.automation.co;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class my_account {
	public static WebDriver driver;
	
	@FindBy(xpath="(//a[text()='Dresses'])[2]")
   private WebElement dress;
	@FindBy(xpath="(//a[text()='Casual Dresses'])[2]")
   private WebElement casual;
	public my_account(WebDriver driver2) {
		 this.driver= driver2;
		 PageFactory.initElements(driver, this);
		 }
	public WebElement getDress() {
		return dress;
	}
	public WebElement getCasual() {
		return casual;
	}}
