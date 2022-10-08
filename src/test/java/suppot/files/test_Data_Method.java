package suppot.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class test_Data_Method {
	public static Properties p;
	public  test_Data_Method() throws IOException {
		File f =new File("C:\\Users\\pcs\\Eclipse Work Space 2.0\\lucifer_Morning\\src\\main\\java\\test\\data\\reading\\adatin.properties");
		FileInputStream fi= new FileInputStream(f);
		 p = new Properties();
		p.load(fi);
	}
	public String getusername() throws IOException {
String username = p.getProperty("username");
 return username;
	}
	public String getpassword() throws IOException {
		String password = p.getProperty("password");
		return password;
	}
}
