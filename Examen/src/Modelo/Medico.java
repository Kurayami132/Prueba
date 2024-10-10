package Modelo;
import Modelo.Paciente;
public class Medico {

	public Medico() {
		// TODO Auto-generated constructor stub
	}
	private String nombre;
	private String apellido;
	private String especialidad;
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double CalcularIMC(Paciente paciente) {
		double peso = paciente.getPeso();
		double estatura = paciente.getEstatura();
		double IMC = peso / (estatura * estatura);
		return IMC;
	}
}