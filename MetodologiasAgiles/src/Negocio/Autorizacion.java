package Negocio;

public class Autorizacion {
	private Estudiante estudiante;
	private Validacion validacion;
	
	public Autorizacion() {
		
	}
	
	public boolean comprobar_datos_uni(Estudiante estudiante) {
		if(this.validacion.comprobar_credenciales() 
				&& this.estudiante.getCorreo().equals(estudiante.getCorreo())) {
			return true;
		}
		return false;

	}
	
	public void autorizar_ingreso(Estudiante estudiante) {
		Interfaz_ingreso_sistema inter = new Interfaz_ingreso_sistema();
		if(comprobar_datos_uni(estudiante)) {
			System.out.print("\nAcceso Autorizado");
			inter.mostrar_interfaz();
		}
		else {
			System.out.print("\nCredenciales Incorrectas");
		}
	}
	
	public Estudiante getEstudiante() {
		return estudiante;
	}
	
	public Validacion getValidacion() {
		return validacion;
	}
	
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	
	public void setValidacion(Validacion validacion) {
		this.validacion = validacion;
	}

}
