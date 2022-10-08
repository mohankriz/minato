package Runner.auto.org;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import ultility.orignal.co.Base_Proutil;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\pcs\\Eclipse Work Space 2.0\\yellow_flash\\feature files\\auto.feature",
glue = "com.stepdef",monochrome = false,dryRun = false,publish = false,plugin =

	"html:report\\auto.html"
		//"json:jason\\dato.json" 

)
//@CucumberOptions(features = "C:\\Users\\pcs\\Eclipse Work Space 2.0\\yellow_flash\\automulti\\mulitidata_automation.feature",
//glue = "com.multi.data")//tags = "@ad2"
public class automation_runner {
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