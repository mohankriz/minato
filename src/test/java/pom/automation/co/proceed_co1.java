package pom.automation.co;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class proceed_co1 {

	public static WebDriver driver;
	public proceed_co1(WebDriver driver2) {
		 this.driver=driver2;
		 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceed;
	public WebElement getProceed() {
		return proceed;
	}
	

}
