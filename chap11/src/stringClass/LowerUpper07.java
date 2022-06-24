package stringClass;

public class LowerUpper07 {

	public static void main(String[] args) {
		String str1 = "java programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr = str1.toLowerCase();
		System.out.println(lowerStr);
		String upperStr = str1.toUpperCase()	;
		System.out.println(upperStr);
		
		

	}

}
