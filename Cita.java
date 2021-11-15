public class Cita {
Estudiante estudiante=new Estudiante();
Profesor profesor= new Profesor();
Materia materia = new Materia();


public Cita() {
	
}

public Cita(Estudiante estudiante, Profesor profesor, Materia materia, String link_cita) {
	super();
	this.estudiante = estudiante;
	this.profesor = profesor;
	this.materia = materia;
	this.link_cita = link_cita;
}

String link_cita;

public Estudiante getEstudiante() {
	return estudiante;
}

public void setEstudiante(Estudiante estudiante) {
	this.estudiante = estudiante;
}

public Profesor getProfesor() {
	return profesor;
}

public void setProfesor(Profesor profesor) {
	this.profesor = profesor;
}

public Materia getMateria() {
	return materia;
}

public void setMateria(Materia materia) {
	this.materia = materia;
}

public String getLink_cita() {
	return link_cita;
}

public void setLink_cita(String link_cita) {
	this.link_cita = link_cita;
}

public void revervar_cita() {
	
}

public void generar_link() {
	
}

}

