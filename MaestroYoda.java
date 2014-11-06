import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Freeder {
	// TODO Auto-generated constructor stub
	public static void main(String args[]){
		//throws IOException{
		Scanner scan= new Scanner(System.in);
		System.out.println("Ingrese la ruta al archivo que desea leer ej: C://User/Desktop/file.txt");
		String text= scan.nextLine();
		System.out.println(text);
		new Freeder(text);
	}
	public Freeder(String path) throws IOException
	{
		String palabra = ""; 
		char[] letras = new char[palabra.length()]; 

		for (int i = 0; i < letras.length; i++) 
		letras[i] = palabra.charAt(i); 

		Arrays.sort(letras); 

		for (int i = 0; i < letras.length; i++) 
		System.out.print(letras[i]); 

		System.out.println(); 
		

		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();

			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			System.out.println(sb.toString());
		} 
		finally {
			br.close();
		}
		
	}
	
	FileOutputStream fs=null;
	byte [] buffer = new byte[5];
	try{
		System.out.println("Ingrese");
		int nbbyte = System.in.read(buffer);
		fs = new FileOutputStream("Output_MaestroYoda201318664.txt");
		fs.write(buffer, 0, nbbyte);
	}catch (Exception e ){
		System.out.println("Error"+ e.toString());
			}
		
	}
}