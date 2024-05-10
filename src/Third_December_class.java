
public class Third_December_class {

	public static void main(String[] args) {
		
		//Counting No. of Chars in a String using : length()
		
				
				String course = "Java";
				 
				int x = course.length();
				System.out.println(x);
		
		
		//Capturing char present at the specified position using : charAt()
		
				
				String course1 = "Java";
				 
				char y = course1.charAt(0);
				System.out.println(y);
				

	
		//Converting a String to LowerCase using : toLowerCase()
		
				
				String course2 = "SeleNium";
				 System.out.println(course2.toLowerCase());

		
		//Converting a String to UpperCase using : toUpperCase()
		
				
				String course3 = "python";
				System.out.println(course3.toUpperCase());

				
		//Comparing Two Strings using : equals()
		
				String exp, act;
				exp = "Ankit";
				act = "Ankit";
				System.out.println(exp.equals(act));

				/*
		//Comparing Two Strings using : equalsIgnoreCase()
		
				
			
		
		//Checking a String contains another String or not using : contains()
		
				
				String str1,str2;
				str1 = "Welcome to Java Course";
				str2 = "Java";
				
				boolean res = str1.contains(str2);
				System.out.println(res);

		
		//Checking a String contains another String or not using : contains()
		
				
				String str1,str2;
				str1 = "Welcome to Java Course";
				str2 = "python";
				
				boolean res = str1.contains(str2);
				System.out.println(res);

				
				String str1,str2;
				str1 = "Welcome to Java Course";
				str2 = "java";
				
				boolean res = str1.toLowerCase().contains(str2);
				System.out.println(res);
		
		//Checking a String contains another String or not using : contains()
	
				String str1,str2;
				str1 = "Welcome to Java Course";
				str2 = "JAVA";
				
				boolean res = str1.toUpperCase().contains(str2);
				System.out.println(res);

		
		//Checking a String contains another String or not using : contains()
		
				
				String str1,str2;
				str1 = "Welcome to Java Course";
				str2 = "JAva";
				
				boolean res = str1.toLowerCase().contains(str2.toLowerCase());
				System.out.println(res);
		
		// compareTo()
		
				String str1,str2;
				
				str1 = "A";
				str2 = "A";		
				System.out.println(str2.compareTo(str1)); // output 0
				
				str1 = "A";
				str2 = "B";		
				System.out.println(str2.compareTo(str1)); // outout 1
				
				str1 = "B";
				str2 = "A";		
				System.out.println(str2.compareTo(str1)); // output -1	
				*/
	}

}
