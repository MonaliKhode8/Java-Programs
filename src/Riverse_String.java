
public class Riverse_String {


	public static void main(String[] args) {
		
		String originalStr = "Welcome";
		String reversedStr = "";

		for (int i = 0; i < originalStr.length(); i++) {
		  reversedStr = originalStr.charAt(i) + reversedStr;
		}

		System.out.println("Reversed string: "+ reversedStr);
		
		
	}
}