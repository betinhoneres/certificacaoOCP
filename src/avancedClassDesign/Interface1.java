package avancedClassDesign;

public interface Interface1 {

	int var = 0;
	
	default void increaseVar() {
		//var++;
	}
	
	default void decreaseVar() {
		//var--;
	}
	
	void printUrl();
	
	default void helper() {
		printUrl();
	}
}
