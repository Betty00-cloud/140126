package actividad1;
/*
Clase que implementa una calculadora
@author Beatriz Pérez Medrano
@version 1.0
Se modificaron 10 cosas
 */
import java.util.Scanner;

public class CalculadoraMisteriosa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continuar = true;

		while (continuar) {
			System.out.println("=== CALCULADORA MISTERIOSA ===");
			System.out.println("1. Sumar dos números");
			System.out.println("2. Restar dos números");
			System.out.println("3. Multiplicar dos números");
			System.out.println("4. Dividir dos números");
			System.out.println("5. Calcular promedio");
			System.out.println("6. Mostrar instrucciones");
			System.out.println("7. Salir");
			System.out.print("Selecciona una opción: ");

			int opcion = scanner.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Resultado: " + sumar());
				break;
			case 2:
                // Quito los valores de la resta
				System.out.println("Resultado: " + restar());
				break;
			case 3:
				System.out.println("Resultado: " + multiplicar());
				break;
			case 4:
                // Quito los valores de la división
				System.out.println("Resultado: " + dividir());
				break;
			case 5:
				System.out.println("Resultado: " + calcularPromedio());
				break;
			case 6:
				mostrarInstrucciones();
				break;
			case 7:
				continuar = false;
				System.out.println("Cerramos calculadora");
				break;
			default:
				System.out.println("Opción inválida");
				break;
			}
		}
		scanner.close();

	}

    /**
     * Opción de suma
     * @return
     */

    public static int sumar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa el primer número: ");
		int a = sc.nextInt();
		System.out.print("Ingresa el segundo número: ");
		int b = sc.nextInt();
        // En vez de restar ponemos una suma
		return a + b;
	}

    /**
     * Opción de resta
     * @return
     */
    // Quitamos valores recibidos para que funcione
	public static int restar() {
        //Incluimos toda la parte de sumar excepto el return a restar
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = sc.nextInt();
        // En vez de multiplicar restamos
        return a - b;
	}

    /**
     * Opción de multiplicar
     * @return
     */
	public static int multiplicar() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa el primer número: ");
		int num1 = sc.nextInt();
		System.out.print("Ingresa el segundo número: ");
		int num2 = sc.nextInt();
    //En vez de sumar multiplicamos
		return num1 * num2;
	}

    /**
     * Opción de dividir
     * @return
     */
    // Quitamos valores recibidos para que funcione la división
	public static double dividir() {
        //Incluimos toda la parte de sumar excepto el return a dividir
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = sc.nextInt();
		return a / b;
	}

    /**
     * Cálculo del promedio de los numeros
     * @return
     */
	public static double calcularPromedio() {
		double[] numeros = { 10, 20, 30, 40, 50 };
		double suma = 0;

		for (int i = 0; i <= numeros.length; i++) {
			suma += numeros[i];
		}

		return suma / (numeros.length - 1);
	}

	public static void mostrarInstrucciones() {
		/*
		 * System.out.println("\n=== INSTRUCCIONES ===");
		 * System.out.println("1. Selecciona una operación del menú");
		 * System.out.println("2. Ingresa los números cuando se te solicite");
		 * System.out.println("3. El resultado se mostrará en pantalla"); System.out.
		 * println("4. Puedes realizar múltiples operaciones hasta elegir Salir");
		 */
	}

}

