//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion = -1;

        while (opcion != 0){

        System.out.println("Bienvenido al sistema de ingreso de alumnos Duoc UC ");
        System.out.println("Para continuar ingrese una opción");
        System.out.println("0. salir del programa");
        System.out.println("1. registrar alumnos");
        System.out.println("2. Mostrar alumnos");
        opcion = scanner.nextInt();

        if (opcion == 1 ){

            System.out.println("Ingrese la cantidad de alumnos que desea registrar");
            int cantidad = scanner.nextInt();
            for (int i=1; i <= cantidad; i++ ){

                System.out.println("Ingrese nombre: ");
                String nombre = scanner.nextLine();

                System.out.println("Ingrese la carrera: ");
                String carrera = scanner.nextLine();

                System.out.println("Ingrese la edad: ");
                int edad = scanner.nextInt();

                Estudiante estudiante1 = new Estudiante (nombre,carrera,edad);

                if (edad < 18){
                    System.out.println("Estudiante joven");
                }else if (26 > edad){
                    System.out.println("Estudiante adultando");
                }else if (35 > edad){
                    System.out.println("Estudiante adulto");
                }else {
                    System.out.println(" Estudiante viejote");
                }


                estudiante1.mostrarInformacion();
                {
        }

        Estudiante estudiante = new Estudiante ("Ignacio Pozas", "Ingeniería en informática", 26);

        estudiante.mostrarInformacion();
        }

        }else if (opcion == 2){
            System.out.println("Enseñando la infomación del estudiante");

        }else if (opcion == 0){
            System.out.println("Saliendo del programa");
            System.exit(0);
        }else {
            System.out.println("Opción ingresada no válida, intente nuevamente.");
        }
}
}
}
