package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import model.entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		String fileInputPath = "c:\\temp\\produtos.csv";
		String pathOut = "c:\\temp\\out";
		
		boolean directory = new File(pathOut).mkdir();

		List<Produto> produtos  = new ArrayList<>();
		String[] atributo = new String[3];
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileInputPath))){
			
			String linha = br.readLine();
			
			while(linha != null) {	
				atributo = linha.split(",");
				produtos.add(new Produto(atributo[0], Double.parseDouble(atributo[1]), Integer.parseInt(atributo[2])));
				linha = br.readLine();
			}
			
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut + "\\summary.csv"))){
				if (directory == true) {
					for(Produto produto: produtos) {
						bw.write(produto.toString());
						bw.newLine();
					}
				}
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
		
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
