public class Profesor {
String nombre_profesor;
String correo_profesor;
String [][] matrizCuadrada = new String[5][5];

public Profesor() {
	
}


public Profesor(String nombre_profesor, String correo_profesor, String[][] matrizCuadrada) {
	this.nombre_profesor = nombre_profesor;
	this.correo_profesor = correo_profesor;
	this.matrizCuadrada = matrizCuadrada;
}


public String getNombre_profesor() {
	return nombre_profesor;
}
public void setNombre_profesor(String nombre_profesor) {
	this.nombre_profesor = nombre_profesor;
}
public String getCorreo_profesor() {
	return correo_profesor;
}
public void setCorreo_profesor(String correo_profesor) {
	this.correo_profesor = correo_profesor;
}
public String[][] getMatrizCuadrada() {
	return matrizCuadrada;
}
public void setMatrizCuadrada(String[][] matrizCuadrada) {
	this.matrizCuadrada = matrizCuadrada;
}


}
