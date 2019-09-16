import java.util.Scanner;

/* Crear una clase para guardar los empleados de la empresa. Tiene que tener las propiedades nombre, dni y sueldo.

Añadiremos un método sueldoNeto que nos devolverá el sueldo multiplicado por 0.85*/

class empleados {
	String nombre;
	String dni;
	double sueldo;
	
	public double sueldoNeto() {
		double neto;
		neto = sueldo * 0.85;
		return neto;
	}
}

public class Clases {
	public static void main(String args[]) {
		empleados empleado_actual = new empleados();
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el nombre del empleado: ");
		empleado_actual.nombre = sc.next();
		System.out.print("Introduce el DNI del empleado: ");
		empleado_actual.dni = sc.next();
		System.out.print("Introduce el sueldo del empleado: ");
		empleado_actual.sueldo = sc.nextDouble();
		sc.close();
		
		System.out.println("-------------------------------------------------");
		System.out.println("Nombre: " + empleado_actual.nombre);
		System.out.println("DNI: " + empleado_actual.dni);
		System.out.println("Sueldo neto: " + empleado_actual.sueldoNeto());	
	}
}
		
