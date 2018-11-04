package avancedClassDesign;

public class Whizlabs2 {

	public static void main(String[] args) {
		String url = "whizlabs.com";
		//url = "whizlabs.net";
		
		Whizlabs whizlabs = new Whizlabs() {
			
			public void printUrl() {
				System.out.println(url);
			}
		};
		
		whizlabs.printUrl();
	}
	
}