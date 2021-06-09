package model;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	
	private int intentos = 0;
	private int rta = 0;
	
	public GuessGame() {
		
		Random random = new Random();
		rta = random.nextInt(500)+1;
	}
	
	public int getIntentos() {
		return intentos;
	}
	
	public int getRta() {
		return rta;
	}
	
	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}
	
	public void setRta(int rta) {
		this.rta = rta;
	}
	
	public boolean guess() {
		
		try {
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			
			if(num == getRta()) { System.out.println("Felicitaciones su respuesta " + num + " fue correcta \n" + "Nro intentos: " + getIntentos());
			return true;}
			
			else if(num > getRta()) {System.out.println("Su respuesta es mayor");
			return false;}
			
			else {System.out.println("Su respuesta es menor");
			return false;}
				
			
		} catch (InputMismatchException e) {
			
			System.out.println("Ingreso invalido");
			return false;
		}
		finally {
			setIntentos(getIntentos() + 1);
		}
		
	}
}
