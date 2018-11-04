package avancedClassDesign;

public class MainApp {

	enum Color {
		
		BLACK(1), WHITE(0);
		
		private final int code;
		
		Color(int code){
			this.code = code;
		}
		
		public String toString() {
			return String.valueOf(code);
		}
	}
	
	
	public static void main(String[] args) {
		Color color = Color.BLACK;
		Color color2 = Color.WHITE;
		System.out.println(color.ordinal());
		System.out.println(color2.ordinal());
		System.out.println(color + "-"+ color.ordinal());
	}
}