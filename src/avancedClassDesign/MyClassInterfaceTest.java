package avancedClassDesign;

import java.awt.List;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MyClassInterfaceTest implements Interface1 {

	public void testFinalField() {
		//var = 2;
	}

	@Override
	public void printUrl() {
		// TODO Auto-generated method stub
		
	}
	
	protected void metodoPrivadoPorDefault() {
		
	}

	public void lambdaCase() throws ArithmeticException {
		InterfaceFunctional functional = (n1,n2) -> {return n1 > n2;};
	}
	
	public static void main(String[] args) {
		
		MyClassInterfaceTest myClass = new MyClassInterfaceTest();
		try {
			myClass.lambdaCase();
			
			Collection<String> colecao = new ArrayList<>();

			ArrayList lista = new ArrayList<>();
			
			ArrayList<String> mylist = new ArrayList<String>();
			
			ArrayList list = new ArrayList<Integer>();
			
			Map<Integer, String> map = new HashMap<>();
			map.put(1, "A");
			map.put(2, "B");
			map.put(3, "C");
			map.put(4, "D");
			map.remove("A");
			map.remove(3, "C");
			map.remove(4, "B");
			map.values().forEach(System.out::print);

			File f = new File("diretorio");
			//Files.readAllLines("teste");
			
		}catch (Exception e) {
		}
		
	}
}