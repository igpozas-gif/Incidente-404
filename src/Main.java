//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Estudiante estudiante = new Estudiante ("Ignacio Pozas", "Ingeniería en informática", 26);

        estudiante.mostrarInformacion();

        System.out.println("Ingrese nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la carrera: ");
        String carrera = scanner.nextLine();

        System.out.println("Ingrese la edad: ");
        int edad = scanner.nextInt();

        Estudiante estudiante1 = new Estudiante (nombre,carrera,edad);


        if (edad >= 18){
            System.out.println("Acceso autorizado");
        }else {
            System.out.println("Acceso restringido");
        }

        estudiante1.mostrarInformacion();

    }
}