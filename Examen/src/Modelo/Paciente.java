package Modelo;

public class Paciente {

	public Paciente() {
		// TODO Auto-generated constructor stub
	}
	private String nombre;
	private String apellido;
	private double estatura;
	private double peso;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String TraerNombreCompleto () {
		return (nombre + " " +apellido);
	}
}