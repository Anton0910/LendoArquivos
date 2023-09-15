package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//forma mais simples
//		File file = new File ("D:\\eclipse\\projetos\\teste.txt");
//		Scanner sc = null;
//		try {
//			sc = new Scanner (file);
//			while (sc.hasNextLine()) {
//				System.out.println(sc.nextLine());
//			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		finally {
//			if ( sc != null) {
//				sc.close();
//			}
//			
//		}
		//Forma mais rapida
		String path = "D:\\eclipse\\projetos\\teste.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine(); //Retorna nullo se a proxima linha for vazia
			while (line!= null) {
				System.out.println(line);
				line =br.readLine();
			}
		}
		 catch (IOException e) {
			 e.printStackTrace();
		 }
    }
}


