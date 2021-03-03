package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		String path = "c:\\section17\\productlist.csv";
		
		List<Product> products = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String items = br.readLine();
			while(items != null) {
				String[] itemFields = items.split(",");
				String name = itemFields[0];
				Double value = Double.parseDouble(itemFields[1]);
				Integer qt = Integer.parseInt(itemFields[2]);
				
				products.add(new Product(name, value, qt));
				
				items = br.readLine();
			}
			
			path = "c:\\section17\\out\\summary.csv";
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(path));
			
			for(Product p : products) {
				bw.write(p.getName() + "," + p.getTotalValue());
				bw.newLine();
			}
			System.out.println("Arquivo .csv criado com sucesso!");
			bw.close();
		}
		catch(IOException e) {
			e.getStackTrace();
		}
	}
}
