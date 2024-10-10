package Test;
import Modelo.Paciente;
import Modelo.Medico;
import java.util.Scanner;

public class TestConsultorio2 {

	public TestConsultorio2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modelo.Paciente paciente = new Modelo.Paciente();
		paciente.setNombre("Jose");
		paciente.setApellido("Perez");
		paciente.setEstatura(1.70);
		
		Modelo.Paciente paciente2 = new Modelo.Paciente();
		paciente2.setNombre("Jorge");
		paciente2.setApellido("Fernandez");
		paciente2.setEstatura(1.80);

		
		Modelo.Medico medico = new Modelo.Medico();
		medico.setNombre("Daniel");
		medico.setApellido("Lopez");
		medico.setEspecialidad("no se");
		
		System.out.println("Ingrese el peso de " + paciente.TraerNombreCompleto());
		Scanner scan = new Scanner(System.in);
		int peso = scan.nextInt();
		
		paciente.setPeso(peso);
		
		System.out.println("Ingrese el peso de " + paciente2.TraerNombreCompleto());
		peso = scan.nextInt();
		
		paciente2.setPeso(peso);
		
		System.out.println("Visita 2");
		System.out.println("Medico: " + medico.getNombre() + " " +medico.getApellido());
		System.out.println("Paciente  " + paciente.TraerNombreCompleto() + " : IMC " + medico.CalcularIMC(paciente));
		System.out.println("Paciente  " + paciente2.TraerNombreCompleto() + " : IMC " + medico.CalcularIMC(paciente2));	
	}
}