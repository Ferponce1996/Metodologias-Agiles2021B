package Negocio;

import java.util.Scanner;

public class Interfaz_ingreso_sistema {
	
	
	public Interfaz_ingreso_sistema() {
		
	}
	
	public void mostrar_interfaz() {
		int menu=0, materia, horario;
		Estudiante estudiante = new Estudiante();
		Materia materia1, materia2;
		Profesor profesor = new Profesor("Carlos Cuesta","carlos.cuesta@epn.edu.ec");
		Cita cita = new Cita();
		cita.setNombre_profesor(profesor.getNombre_profesor());
		while(menu != 4) {
		System.out.print("\n1. Seleccionar Materia");
		System.out.print("\n2. Seleccionar Horario");
		System.out.print("\n3. Confirmar");
		System.out.print("\n4. Salir\n");
		Scanner sca=new Scanner(System.in);
		menu = sca.nextInt();
		switch (menu) {
		case 1:
			System.out.print("\n1. Matematicas");
			System.out.print("\n2. Quimica\n");
			materia = estudiante.seleccionar_materia();
			switch(materia) {
			case 1: 
				System.out.print("\nUsted ha seleccionado Matematicas\n");
				materia1= new Materia("Matematicas", "1");
				cita.setNombre_materia(materia1.nombre_materia);
				break;
			case 2:
				System.out.print("\nUsted ha seleccionado Quimica\n");
				materia2= new Materia("Quimica", "2");
				cita.setNombre_materia(materia2.nombre_materia);
				break;
			}
			break;
		case 2:
			System.out.print("\n1. Lunes 15:00-16:00");
			System.out.print("\n2. Martes 17:00-18:00\n");
			horario = estudiante.seleccionar_horario();
			switch(horario) {
			case 1: 
				System.out.print("\nUsted ha seleccionado Lunes 15:00-16:00\n");
				cita.setHorario("Lunes 15:00-16:00");
				break;
			case 2:
				System.out.print("\nUsted ha seleccionado Martes 17:00-18:00\n");
				cita.setHorario("Martes 17:00-18:00");
				break;
			}
			break;
		case 3:
			System.out.print("\nIngrese S para guardar o N para cancelar\n");
			sca=new Scanner(System.in);
			String aux = estudiante.cofirmar_cita();
			String aux1 = "S", aux2 = "N";
			if(aux.equalsIgnoreCase(aux1)) {
				cita.reservar_cita();
				estudiante.ingresar_preguntas();
				menu = 4;
			}
			if(aux.equalsIgnoreCase(aux2)) {
				System.out.print("\nSu cita se cancelado");
				menu = 4;
			}
			break;
		}
		}

	}

}
