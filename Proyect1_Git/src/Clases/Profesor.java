package Clases;

public class Profesor {
	private String profesor;
	private int cod_profesor;
	private String aux_prof;
	private String jefe_depart;
	private Asignatura asignatura;
	
	//Constructores
	public Profesor() {
	}
	
	public Profesor(String profesor, int cod_profesor, Asignatura asignatura) {
		this.profesor = profesor;
		this.cod_profesor = cod_profesor;
		this.asignatura = asignatura;
	}

	//Metodos
	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public int getCod_profesor() {
		return cod_profesor;
	}

	public void setCod_profesor(int cod_profesor) {
		this.cod_profesor = cod_profesor;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
	
	//CargarProfesores
			public void cargarProfesores(String[] profesor) {
				profesor = new String [] {"Luis Perez Gonzalez",
						"Eva Martinez Ruiz",
						"Carmen Sanchez Lopez",
						"Pedro Salinas Burgos","Eugenia Simon Moreno"};
				
				cod_profesor = (int)(Math.random()*150+1);
				
				int aleatorio =(int) Math.floor(Math.random()*profesor.length);
				String seleccion = profesor[aleatorio];
				aux_prof = seleccion;
				System.out.println("Profesor: " + aux_prof + " Codigo de profesor: " + cod_profesor);
			}
		
			//JefeDepart
			public void jefeDepartamento(String[] profesor) {
				profesor = new String [] {"Luis Perez Gonzalez",
						"Eva Martinez Ruiz",
						"Carmen Sanchez Lopez",
						"Pedro Salinas Burgos","Eugenia Simon Moreno"};
				
				cod_profesor = (int)(Math.random()*150+1); 
				int aleatorio =(int) Math.floor(Math.random()*profesor.length);
				String seleccion = profesor[aleatorio];
				jefe_depart = seleccion;
				System.out.println("Jefe Departamento: " + jefe_depart + " Codigo de profesor: " + cod_profesor);
				}
	//ToString
		
		@Override
		public String toString() {
			return "Profesor: " + profesor + "\nCodigo de profesor: " + cod_profesor + 
					"\nAsignatura: " + asignatura;
		}
}
