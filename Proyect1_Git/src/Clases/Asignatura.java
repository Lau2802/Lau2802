package Clases;

import java.util.*;

public class Asignatura {
	private String asignatura;
	private Profesor profesor;
	private Alumno alumno;
	private String departamento;
	private int media;
	private int suma;
	
	//Constructores
	
	public Asignatura() {
	}
	
	public Asignatura(String asignatura, Profesor profesor, Alumno alumno, String departamento, int media, int suma) {
		this.asignatura = asignatura;
		this.profesor = profesor;
		this.alumno = alumno;
		this.departamento = departamento;
		this.media = media;
		this.suma = suma;
	}


	//Metodos
	//Getter-Setter
	public String getNombre() {
		return asignatura;
	}
	public void setNombre(String nombre) {
		this.asignatura = nombre;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	//CargarDepartamento
			public void cargarDepartamento() {
				Scanner teclado = new Scanner(System.in);
				int sala_depart = 0;
				
				System.out.println("Esribe la asignatura");
				asignatura = teclado.nextLine();
				System.out.println("Introduzca departamento");
				departamento = teclado.nextLine();
				
				sala_depart = (int)(Math.random()*150+1);
				System.out.println("Departamento: " + departamento + "\nAsignatura: " + asignatura + "\nSala: " + sala_depart );
			}
	//CargarNotas
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
		return "Asignatura =" + asignatura + "\nDepartamento" + departamento;
		}
}
