package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double a,double b) throws IllegalArgumentException {
		if(b==0.0) {
			throw new IllegalArgumentException();
		}
		return a/b; 
	}
	
		public String reverseString(String str) throws IllegalStateException {
			if(str.length()>0) {
				String s = "";
				for(int i = str.length()-1;i>=0;i--) {
					s+=str.charAt(i);
				}
				return s;
			} else {
				throw new IllegalStateException();
			}
		}
}
