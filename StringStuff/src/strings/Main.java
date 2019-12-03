/*
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * Demonstrating the String and StringBuilder data types
 */
package strings;
public class Main {

	public static void main(String[] args) {
		testSomeStrings();
		testSomeStringBuilders();
	}
	public static void testSomeStrings() {
		String test = "Todd Lindemann";
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000000000; i++) {
			//test = "Oscar Robertson"; //init a string variable with a string literal
			//test = test + "!"; //append operation, but actually making a new string
			String fruit = "Applee";
			fruit = fruit.replace("ee", "e");
			//System.out.println(fruit);
		}
		long endTime = System.nanoTime();

		// get difference of two nanoTime values
		long timeElapsed = endTime - startTime;
		System.out.println("testSomeStrings(): Execution time in milliseconds : " + (double)timeElapsed / 1000000);
	}
	/***
	 * Run some StringBuilder operations and see how long it takes
	 */
	public static void testSomeStringBuilders() {
		StringBuilder test = new StringBuilder("Todd Lindemann");
		long startTime = System.nanoTime();
		for (int i = 0; i < 1000000000; i++) {
			//test = new StringBuilder("Oscar Robertson"); // same as above 
			//test = test + "!"; 
			//append stringbuilder with append operation 
			//test.append("!"); 
			test = new StringBuilder ("Applee");
			//System.out.println("Before replace, test = " + test.toString());
			test.replace(4,7,"e");//replaces 'ee' with 'e'
			//System.out.println("After replace, test = " + test.toString());
		}
		long endTime = System.nanoTime();

		// get difference of two nanoTime values
		long timeElapsed = endTime - startTime;
		System.out.println("testSomeStringBuilders(): Execution time in milliseconds : " + (double)timeElapsed / 1000000);
	}

}
