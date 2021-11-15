package Negocio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante();
		Validacion validacion = new Validacion();
		Autorizacion autorizacion = new Autorizacion();
		String aux="";
		Scanner sca= new Scanner(System.in);
		
		System.out.print("Ingrese nombre y apellido\n");
		aux=sca.nextLine();
		estudiante.setNombre(aux);
		System.out.print("Ingrese cedula\n");
		aux=sca.nextLine();
		estudiante.setCedula(aux);
		System.out.print("Ingrese correo\n");
		aux=sca.nextLine();
		estudiante.setCorreo(aux);
		
		validacion.setEstudiante(estudiante);
		
		Estudiante estudiante2 = new Estudiante();
		estudiante2.setNombre(validacion.getNombre());
		estudiante2.setCorreo(validacion.getCorreo());
		estudiante2.setCedula(validacion.getCedula());
		autorizacion.setEstudiante(estudiante2);
		autorizacion.setValidacion(validacion);
		
		autorizacion.autorizar_ingreso(estudiante);
		
		
	}

}
