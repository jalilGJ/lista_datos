package lista__de_datos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @jalil garcia jeronimo
 */
public class Lista__de_Datos {

    public static void main(String[] args) {
        ArrayList<String> Isic3 = new ArrayList<>();
        String alumnos;
        String X;
        String eliminar;
        String buscar;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingenieria en sistemas computacionales");
        do {
            System.out.println("ingrese un alumno de tercer semestre");
            alumnos = leer.next();
            Isic3.add(alumnos);
            System.out.println("Desea continuar registrando datos: Si/No");
            X = leer.next();
            X = X.toUpperCase();

        } while (!X.equals("NO"));
        System.out.println("Alumnos en linea:");
        for (int i = 0; i < Isic3.size(); i++) {
            System.out.println(Isic3.get(i));
        }
        System.out.println("Que elemento desea eliminar:");
        eliminar = leer.next();
        Isic3.remove(eliminar);

        System.out.println("¿Que elemento de la lista de datos desea buscar?");
        buscar = leer.next();
        System.out.println(Isic3.contains(buscar));

        System.out.println("Alumnos de tercer semetres de la carrera en ingenieria en sistemas computacionales:");
        for (int i = 0; i < Isic3.size(); i++) {
            System.out.println(Isic3.get(i));
        }
    }

}
