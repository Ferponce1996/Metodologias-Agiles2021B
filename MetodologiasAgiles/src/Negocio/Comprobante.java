package Negocio;

public class Comprobante {
	private String cod_comprobante;
	private String nombre_estudiante;
	private String nombre_profesor;
	private String nombre_materia;
	private String horario;
	private String link_cita;
	
	public Comprobante(String nombre_estudiante, String nombre_profesor, String nombre_materia,
			String horario, String link_cita) {
		this.cod_comprobante = "104578";
		this.nombre_estudiante = nombre_estudiante;
		this.nombre_profesor = nombre_profesor;
		this.nombre_materia = nombre_materia;
		this.horario = horario;
		this.link_cita = link_cita;
	}
	
	public void generar_comprobante() {
		System.out.print("\nSe ha generado exitosamente un comprobante para su cita");
		System.out.print("\nCita: \nMateria: "+nombre_materia + "\nProfesor: "+nombre_profesor
				+ "\nHorario: "+horario+"\nLink: "+link_cita);
	}
	
	
}
