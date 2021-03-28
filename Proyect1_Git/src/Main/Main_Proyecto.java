package Main;

import java.util.Scanner;
import Clases.*;

public class Main_Proyecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Notas notas = new Notas();
		Asignatura asignatura = new Asignatura();
		
		System.out.println("Escribe una asignatura");
		String nombre=teclado.nextLine();
		asignatura.setNombre(nombre);
		asignatura.cargarDepartamento();
		
		System.out.println();
		System.out.println("***Alumnos***");
		asignatura.cargarAlumnos(args);
		System.out.println();
		notas.notas();
		System.out.println( "---------Asignatura ---------" );
		System.out.println(asignatura.getNombre());
		System.out.println(notas);
	}

}
