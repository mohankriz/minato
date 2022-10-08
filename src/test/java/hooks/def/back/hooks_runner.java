package hooks.def.back;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import ultility.orignal.co.Base_Proutil;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\pcs\\Eclipse Work Space 2.0\\yellow_flash\\hooks deff\\hooks.feature",
glue = "hooks.def.back")//tags = "@ad2"
public class hooks_runner {
	public static WebDriver driver;
	@BeforeClass
	public static void set_up() {
	driver = Base_Proutil.get_Browser("chrome");
	}
	@AfterClass
	public static void tear_Down() {
	driver.quit();
	
	}

}
