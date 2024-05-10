import java.io.File;
import java.io.IOException;

public class SimpleJavaCommands{

	public static void main(String[] args) throws IOException {
		
	  String javaVersion = System.getProperty("java.version");
	  System.out.println(javaVersion);

	  
	  String Projectpath = System.getProperty("user.dir");
	  System.out.println(Projectpath);
	  
	  String OperatingSystemName = System.getProperty("os.name");
	  System.out.println(OperatingSystemName);
	  
	  String UserName = System.getProperty("user.name");
	  System.out.println(UserName);
	  
	  File file = new File("abcd.txt");
	  file.createNewFile();
	  
	}

}
