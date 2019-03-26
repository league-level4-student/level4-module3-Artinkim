package _01_introduction;

public class CustomException extends Exception {
	void terminate() {
		System.out.println("hi");
		System.exit(0);
	}
	public static void testMethod2(int x) throws Exception {
		if(x<0) {
			throw new CustomException();
		}
	}
}
