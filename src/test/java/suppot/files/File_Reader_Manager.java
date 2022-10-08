package suppot.files;

import java.io.IOException;

public class File_Reader_Manager {
	private  File_Reader_Manager() {
		
	}//private constructor
	
	
	public static File_Reader_Manager reader()//static method
	{
		
		File_Reader_Manager frm =new File_Reader_Manager();
		return frm;
	}

	public test_Data_Method tdr() throws IOException  {
		test_Data_Method test = new test_Data_Method();
		return test;
	}
	}
