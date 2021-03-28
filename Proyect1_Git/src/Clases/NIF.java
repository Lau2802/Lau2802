package Clases;

import java.util.Scanner;

public class NIF {
	private int numero;
	private char letra;
	
	public NIF(){
		
	}
	public NIF(int numero){
		this.numero = numero;
		letra = obtenerletra(); 
	}
	//Metodo para calcular la letra
	private char obtenerletra() {
		char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};                      
		return letra[numero%23];
	}
	//Metodo Leer
	public void leer(){
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Introduce DNI: ");
			numero = teclado.nextInt();
			teclado.close();
		}
		while(numero<=0);
		letra = obtenerletra();
	}
	//Metodo para el String
	public String toString(){
		String nif = String.valueOf(this.numero);
		while(nif.length()<8) {
			nif = "0" +nif;
		nif =nif + "-"+ this.letra;
		}
		return nif;
	}
	//Generar dni aleatorio
	public static NIF generateRandomDNI() {
		int numNif = ((int)(Math.random() * 10000000));
		return new NIF(numNif);
	}
}
