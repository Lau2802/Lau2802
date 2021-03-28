package Clases;

import java.util.Scanner;

public class Notas {
	private double[] notas;
	private Asignatura asignatura;
	private double suma;
	private double media;

	//Constructores
	public Notas() {
	}
	
	public Notas(double[] notas, Asignatura asignatura) {
		this.notas = notas;
		this.asignatura = asignatura;
	}
	
	//Metodos
	//Getter-Setter

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}


	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}


	//Notas
		public void notas() {
			Scanner teclado = new Scanner(System.in);
			
			double[] notas = new double [5];
			
			for(int i = 0; i<notas.length; i++) {
				System.out.println("Escribe las notas del alumno" + (i+1));
				notas [i] = teclado.nextDouble();
			}
			
			for(int i = 0; i<notas.length; i++) {
				suma+= notas[i];
				media = suma/notas.length;
			}
			
			System.out.println("La media de la clase es " + media);
			for(int i = 0; i<notas.length; i++) {
				if(notas[i]<=10) {
					if(notas[i]>=media) {
						System.out.println("El alumno " + (i+1) + " ha superado la media con " + notas[i]);
					}
				}
				else {
					System.out.println("Error con las notas");
				}
			}
		}
		
	//ToString
		@Override
		public String toString() {
			return  "\nMedia: " + media;
		}
}
