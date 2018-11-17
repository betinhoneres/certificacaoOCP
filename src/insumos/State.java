package insumos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class State {
	
	private String name;
	private List<String> cities = new ArrayList<>();
	
	public State(String name, String... cities){
		this.name = name;
		this.cities.addAll(Arrays.asList(cities));
	}
	
	public String getName() {
		return name;
	}

	public List<String> getCities(){
		return cities;
	}
}