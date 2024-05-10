
public class SimpleP_Jan {

	public static void main(String[] args) {
		
		String course1 = "Selenium";
		int x = course1.length();
		System.out.println(x);
		
		String course2 = "Java";
		char y = course2.charAt(2);
		System.out.println(y);
		
		String course3 = "Python";
		System.out.println(course3.toUpperCase());
		
		String course4 = "TesTing";
		System.out.println(course4.toUpperCase());
		
		String exp1 = "Google";
		String act1 = "google";
		boolean issame1 = exp1.equals(act1);
		System.out.println(issame1);
		
		String exp2 = "Google";
		String act2 = "google";
		boolean issame2 = exp2.equalsIgnoreCase(act2);
		System.out.println(issame2);
		
		String exp3 = "Welcome to Home";
		String act3 = "Home";
		boolean Contains3 = exp3.contains(act3);
		System.out.println(Contains3);
		
		
		
	}

}
