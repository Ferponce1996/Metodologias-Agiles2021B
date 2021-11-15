package Negocio;

public class Estudiante {
	private String nombre;
	private String cedula;
	private String correo;
	
	public Estudiante() {
		
	}
	
	public void ingresar_credenciales(String nombre, String cedula, String correo) {
		this.cedula=cedula;
		this.correo=correo;
		this.nombre=nombre;
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
	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
