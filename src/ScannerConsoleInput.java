import java.util.Scanner;

public class ScannerConsoleInput {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int value1 = sc.nextInt();	
		System.out.println("Entered number is: " + value1);
		
		Scanner nm = new Scanner(System.in);
		String name = nm.next();
		System.out.println("Your name is: " + name);
	}

}
