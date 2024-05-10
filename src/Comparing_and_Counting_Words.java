
public class Comparing_and_Counting_Words {

	public static void main(String[] args) {
			
		String a ="Google";
     	String b = "google";
	
     	System.out.println(a.equals(b));
     	System.out.println(a.equalsIgnoreCase(a));

		String count = "You are Welcome to Dr Babasaheb Ambedkar Airport Nagpur";
		int countwords = (count.split("\\s").length);
		System.out.println(countwords);
		
	}

}
