package app;
import java.util.Scanner;

import model.*;
public class Main {

	public static void main(String[] args)  {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		try {
			
			if(s.contains("1") || s.contains("2") || s.contains("3") || s.contains("4") || s.contains("5") || s.contains("6") || s.contains("7") || s.contains("8") || s.contains("9") || s.contains("0")) {
			throw new Exception("Tiene un nro");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	
	}
	
	static void jugar() {
		
		GuessGame juego = new GuessGame();
		boolean q = false;
		
		while(q == false) {
			
			q = juego.guess();
			
		}
	}


}
