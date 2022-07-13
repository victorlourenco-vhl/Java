package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>(); // ArrayList � uma classe que implementa a interface
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		for(String nome: list) {
			System.out.println(nome);
		}
		
		System.out.println("Tamanho da lista: " + list.size());
		
		System.out.println("---------------------------------");
		list.removeIf(x -> x.charAt(0) == 'M'); // Predicado
		
		for(String nome: list) {
			System.out.println(nome);
		}
		System.out.println("---------------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("---------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String nome: result) {
			System.out.println(nome);
		}
		
		System.out.println("---------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
