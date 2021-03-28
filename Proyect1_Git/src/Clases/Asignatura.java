package Clases;

import java.util.*;

public class Asignatura {
		private String asignatura;
		private String profesor;
		private String[] alumno;
		private String departamento;
		
		//Constructores
		
		public Asignatura() {
		}
		public Asignatura(String nombre, String profesor, String[] alumno) {
			this.asignatura = nombre;
			this.profesor = profesor;
			this.alumno = alumno;
		}
		
		//Metodos
		//Getter-Setter
		public String getNombre() {
			return asignatura;
		}
		public void setNombre(String nombre) {
			this.asignatura = nombre;
		}
		public String getProfesor() {
			return profesor;
		}
		public void setProfesor(String profesor) {
			this.profesor = profesor;
		}
		public String[] getAlumno() {
			return alumno;
		}
		public void setAlumno(String[] alumno) {
			this.alumno = alumno;
		}
		//CargarAlumnos
		public void cargarAlumnos(String[] alumno) {
			Scanner teclado = new Scanner(System.in);
			alumno =  new String[5];
			int cod_alumno = 0;
			for(int i = 0; i<alumno.length; i++) {
				System.out.println("Escribe el nombre y apellido del alumno" + ( i + 1));
				alumno[i] = teclado.nextLine();
				cod_alumno = (int)(Math.random()*25+1);
				System.out.println("Alumno: " + alumno[i] + " Codigo del alumno: " + cod_alumno);
			}
		}
		//CargarProfes
		public void cargarProfesores(String[] profesor) {
			int cod_profesor;
			profesor = new String [] {"Luis Perez Gonzalez",
					"Eva Martinez Ruiz",
					"Carmen Sanchez Lopez",
					"Pedro Salinas Burgos","Eugenia Simon Moreno"};
			
			cod_profesor = (int)(Math.random()*150+1);
			
			int aleatorio =(int) Math.floor(Math.random()*profesor.length);
			String seleccion = profesor[aleatorio];
			System.out.println("Profesor: " + seleccion + " Codigo de profesor: " + cod_profesor);
		}
		//CargarDepartamento
				public void cargarDepartamento() {
					Scanner teclado = new Scanner(System.in);
					int sala_depart = 0;
					
					System.out.println("Introduzca departamento");
					departamento = teclado.nextLine();
					
					sala_depart = (int)(Math.random()*150+1);
					System.out.println("Departamento: " + departamento + "\nAsignatura: " + asignatura + "\nSala: " + sala_depart );
				}
		//ToString
		@Override
		public String toString() {
			return "Asignatura: " + asignatura + "\nProfesor:" + profesor;
		}
}
