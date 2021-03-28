package Main;

import java.util.Scanner;
import Clases.*;

public class Main_Proyecto {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 
		 * @author Laura Vaquerizo
		 * @version 3.0
		 */
		Alumno[] listAlumnos = new Alumno[5];
		Profesor profesor  = new Profesor();
		Asignatura asignatura = new Asignatura();
		
		Scanner teclado = new Scanner(System.in);
		/**
		 * Carga usuarios desde una arrayList
		 */
		System.out.println("Introduzca datos del alumno");
		
		for(int i = 0; i <listAlumnos.length; i++) {
			listAlumnos[i] = generarAlumno(teclado, i);
		}
		System.out.println("Lista de alumnos llena");
		System.out.println();
		System.out.println();
		
		/**
		 * 
		 * Carga los metodos formados en la clase asignatura.
		 * CargarDepartamento: muestra asignatura y apartamento
		 * Notas: Carga las notas de los alumnos
		 */
		asignatura.cargarDepartamento();
		asignatura.notas();
		System.out.println(asignatura);
		
		
		System.out.println();
		System.out.println();
		
		/**
		 * 
		 * Carga los metodos formados en la clase Profesor
		 */
		System.out.println("Lista de profesores");
		profesor.cargarProfesores(args);
		profesor.jefeDepartamento(args);
		System.out.println(profesor);
		
	}
	
	//GenerarAlumno
	/**
	 * Genera Alumnos con un DNI aleatorio y un codigo de alumno aleatorio
	 * @param teclado del Scanner
	 * @param i para que salga en pantalla alumno1 en vez de 0
	 * @return
	 */
	
	private static Alumno generarAlumno(Scanner teclado, int i) {
		Alumno alumno = new Alumno();
		
		System.out.println("Escribe el nombre y apellido del alumno" + (i + 1));
		alumno.setNombre(teclado.nextLine());
		
		System.out.println("Escribe edad");
		alumno.setEdad(teclado.nextInt());
		teclado.nextLine();
		
		alumno.setCod_alumno((int) (Math.random() * 25 + 1));
		alumno.setDni(NIF.generateRandomDNI());

		System.out.println("Alumno: " + alumno.toString());

		return alumno;
	}
}
