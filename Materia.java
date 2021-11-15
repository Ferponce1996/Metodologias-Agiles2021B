public class Materia {
String nombre_materia;
String cod_materia;


public Materia() {
}

public Materia(String nombre_materia, String cod_materia) {
	this.nombre_materia = nombre_materia;
	this.cod_materia = cod_materia;
}

public String getNombre_materia() {
	return nombre_materia;
}
public void setNombre_materia(String nombre_materia) {
	this.nombre_materia = nombre_materia;
}
public String getCod_materia() {
	return cod_materia;
}
public void setCod_materia(String cod_materia) {
	this.cod_materia = cod_materia;
}

}
