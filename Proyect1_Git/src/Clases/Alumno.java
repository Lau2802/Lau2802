package Clases;

public class Alumno {
	private String nombre;
	private int edad;
	private NIF dni;
	private int cod_alumno;
	
	//Constructores 
	public Alumno() {
	}

	public Alumno(String nombre, int edad, NIF dni, int cod_alumno) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.cod_alumno = cod_alumno;
	}

	//Metodos
	//Getter-Setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public NIF getDni() {
		return dni;
	}

	public void setDni(NIF dni) {
		this.dni = dni;
	}

	public int getCod_alumno() {
		return cod_alumno;
	}

	public void setCod_alumno(int cod_alumno) {
		this.cod_alumno = cod_alumno;
	}
	
	//ToString
	public String toString() {
		return "Nombre: '" + nombre +
			"\nEdad: " + edad +
			"\nDni: " + dni +
			"\nCodigo alumno: " + cod_alumno;
	}
}
