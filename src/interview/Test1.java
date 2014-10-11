package interview;

public class Test1 {
		public static String doRev(String input){        
	        if(input==null){
	            return null;
	        }        
	        if(input.isEmpty()){
	            return input;
	        }
	        char[] inputArr = input.toCharArray();
	        int length = inputArr.length;
	        for(int i=0;i<length;i++){
	            char temp = inputArr[i];
	            inputArr[i] = inputArr[length-1];
	            inputArr[length-1] = temp;
	             
	            length--;
	        }        
	        return new String(inputArr);
	    }
		
		// @Updated by Ranga - Adding Two array, One array, No array solution
		// Two array solution
		public static String doRevUsingTwoArrays(String input) {
			if(input == null || input.isEmpty() || input.length() == 1) {
				return input;
			} else {
				char[] inputArr = input.toCharArray();
				int length = inputArr.length;
				char[] outputArr = new char[length];
				for(int i = 0; i < length; i++) {
					outputArr[i] = inputArr[length - 1 - i];
				}
				return String.valueOf(outputArr);
			}
		}
		
		// @Updated by Ranga.
		// One array solution
		public static String doRevUsingOneArray(String input) {
			if(input == null || input.isEmpty() || input.length() == 1) {
				return input;
			} else {
				char[] inputArr = input.toCharArray();
				StringBuffer sb = new StringBuffer();
				for(int i = (inputArr.length - 1); i >= 0; i--) {
					sb.append(inputArr[i]);
				}
				return sb.toString();
			}
			
		}
				
		// @Updated by Ranga.
		// No array solution
		public static String doRevUsingNoArray(String input) {
			if(input == null || input.isEmpty() || input.length() == 1) {
				return input;
			} else {
				StringBuffer sb = new StringBuffer();
				for(int i = (input.length() - 1); i >= 0; i--) {
					sb.append(input.charAt(i));
				}
				return sb.toString();
			}
		}
						
				
		
		public static void main(String[] args) {
			String input = "tiger";
			System.out.println("Input = " + input);
			System.out.println("Output = " + Test1.doRev(input));
			System.out.println("Output using No Array = " + Test1.doRevUsingNoArray(input));
			System.out.println("Output using One Array = " + Test1.doRevUsingOneArray(input));
			System.out.println("Output using Two Array = " + Test1.doRevUsingTwoArrays(input));
		}
	 

	}