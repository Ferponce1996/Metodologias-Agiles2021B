package Negocio;

public class Cita {
private String nombre_estudiante;
private String nombre_profesor;
private String nombre_materia;
private String horario;
private String link_cita;

public Cita() {
	
}

public String getNombre_estudiante() {
	return nombre_estudiante;
}

public void setNombre_estudiante(String nombre_estudiante) {
	this.nombre_estudiante = nombre_estudiante;
}

public String getNombre_profesor() {
	return nombre_profesor;
}

public void setNombre_profesor(String nombre_profesor) {
	this.nombre_profesor = nombre_profesor;
}

public String getNombre_materia() {
	return nombre_materia;
}

public void setNombre_materia(String nombre_materia) {
	this.nombre_materia = nombre_materia;
}

public String getHorario() {
	return horario;
}

public void setHorario(String horario) {
	this.horario = horario;
}

public String getLink_cita() {
	return link_cita;
}

public void setLink_cita(String link_cita) {
	this.link_cita = link_cita;
}

public void reservar_cita() {
	generar_link();
	Comprobante comprobante = new Comprobante(nombre_estudiante, nombre_profesor, nombre_materia, horario, link_cita);
	System.out.print("\n\nSu cita ha sido reservada exitosamente");
	comprobante.generar_comprobante();
}

public void generar_link() {
	this.link_cita="https://cedia.zoom.us/j/91474587412323";
}

}
