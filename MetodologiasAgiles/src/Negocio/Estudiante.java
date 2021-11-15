package Negocio;

import java.util.Scanner;

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
	
	public void ingresar_preguntas() {
		Scanner sca = new Scanner(System.in);
		System.out.print("\nIngrese preguntas especificas para ser respondidas en su tutoría\n");
		sca.nextLine();
	}
	
	public int seleccionar_horario() {
		Scanner sca = new Scanner(System.in);
		return sca.nextInt();
	}
	
	public int seleccionar_materia() {
		Scanner sca = new Scanner(System.in);
		return sca.nextInt();
	}
	
	public String cofirmar_cita() {
		Scanner sca = new Scanner(System.in);
		return sca.nextLine();
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
