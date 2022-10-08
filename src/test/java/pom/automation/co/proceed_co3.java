package pom.automation.co;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class proceed_co3 {
	public static WebDriver driver;
	public proceed_co3(WebDriver driver2) {
		 this.driver=driver2;
		 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[normalize-space(text()='Proceed to checkout')])[44]")
	private WebElement proceed;
	public WebElement getProceed() {
		return proceed;
	}
	}
