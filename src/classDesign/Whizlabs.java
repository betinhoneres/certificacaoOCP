package classDesign;

public class Whizlabs {

	static final int j = 32;
	
	public static void main(String[] args) {
		char c = 'A';
		System.out.println((char)calc(c));
		System.out.println(20);
		int x = 0;
		System.out.println(x);
	}

	private static char calc(char i) {
		return (char) (i+j);
	}
	
	
}
