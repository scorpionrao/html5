package html5;

public class ReverseExercise {
	
	public static void main(String[] args) {
		
		/** Difference between String and StringBuffer
		Usage - String value cannot changed, it is immutable.
				String Buffer is used when we need to modify or construct a string piece by piece.
				
		Speed - String is thousand times slower
		*/
		// one object is created with value "badri"
		String s1 = "badri";
		// second object is created with value "badrianu", initial object is destroyed in memory
		s1 = s1 + "anu";
		
		// one object is created
		StringBuffer sb = new StringBuffer("badri");
		// still same object is used but the length has increased for the append
		sb.append("anu");
		
		
		/** Example for reverse a String */
		
		// create a String variable and assign it a value
		String input = "anu";
		// convert input string into a char array
		char[] charArray = input.toCharArray();
		// initialize a basic reverse string with empty value
		String reverse = "";
		// get one char at a time from end of array to beginning
		for(int i = charArray.length - 1; i >= 0; i--) {
			// retrieving an element from char array
			System.out.println("Retrieving from index - " + i);
			// add it to reverse
			reverse = reverse + charArray[i];
		}
		// when the entire array is read, come out of for loop and print it
		System.out.println(reverse);
		
		
		
		/** Example for reverse the order of words */
		
		// create a String variable and assign it a value
		String input1 = "my name is anu";
		// split this string at each blank space and put it in an String array
		// ***** instead for char array now we are using String array *****
		String[] stringArray = input1.split(" ");
		// initialize a basic reverse string with empty value
		String reverse1 = "";
		// get one String at a time from end of array to beginning
		for(int i = stringArray.length - 1; i >= 0; i--) {
			// retrieving an element from string array
			System.out.println("Retrieving from index - " + i);
			// add it to reverse
			reverse1 = reverse1 + stringArray[i] + " ";
		}
		// when the entire array is read, come out of for loop and print it
		System.out.println(reverse1);
	}

}
