package Negocio;

public class Validacion {
	private String nombre = "Francisco Flores";
	private String cedula = "1727101574";
	private String correo = "francisco.flores@epn.edu.ec";
	private Estudiante estudiante;
	
	public Validacion() {
		
	}
	
	public boolean comprobar_credenciales() {
		if(this.nombre.equals(estudiante.getNombre()) && this.cedula.equals(estudiante.getCedula())) {
			return true;
		}
		else return false;
	}
	
	public String getCedula() {
		return cedula;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Estudiante getEstudiante() {
		return estudiante;
	}
	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

}
