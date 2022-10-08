package pom.automation.co;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pay_by {
	
	public static WebDriver driver;
	public  pay_by(WebDriver driver2) {
		 this.driver=driver2;
		 PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement pay;



	public WebElement getPay() {
		return pay;
	}
	}