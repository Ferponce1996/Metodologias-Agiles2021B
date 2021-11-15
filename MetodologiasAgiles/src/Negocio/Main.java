package Negocio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante();
		Validacion validacion = new Validacion();
		Autorizacion autorizacion = new Autorizacion();
		String aux1, aux2, aux3="";
		Scanner sca= new Scanner(System.in);
		
		System.out.print("Ingrese nombre y apellido\n");
		aux1=sca.nextLine();
		System.out.print("Ingrese cedula\n");
		aux2=sca.nextLine();
		System.out.print("Ingrese correo\n");
		aux3=sca.nextLine();
		
		estudiante.ingresar_credenciales(aux1, aux2, aux3);
		
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
