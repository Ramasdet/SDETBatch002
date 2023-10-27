package stringClassMethods;

public class StringIntegrateMethods {

	public static void main(String[] args) {
		String str = "java is super";
		char[] result = str.toCharArray();
		
			for (int i = result.length - 1; i >= 0; i--) {
				System.out.print(result[i]);
			
			}
		}
	}


//		String str1 = "i love java";
//		String rv="";
//		for(int i=0; i<str1.length();i++) {
//			rv=str1.charAt(i)+rv;
//		}
//		System.out.println(rv);
//		

// }

//}
