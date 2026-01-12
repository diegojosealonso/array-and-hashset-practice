import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ejercicio 1
        ArrayList<String> miLista = new ArrayList<>();
        miLista.add("terry");
        miLista.add("manuel");
        miLista.add("nerea");
        miLista.add("isabel");
        miLista.add("alba");
        System.out.println(miLista.getFirst());
        System.out.println(miLista.getLast());
        System.out.println(miLista.size());

        // ejercicio 2
        ArrayList<Double> miOtraLista = new ArrayList<>();
        miOtraLista.add(1.0);
        miOtraLista.add(7.3);
        miOtraLista.add(8.4);
        miOtraLista.add(4.5);
        miOtraLista.add(0.2);
        double media = (miOtraLista.get(0) +  miOtraLista.get(1) + miOtraLista.get(2) + miOtraLista.get(3) + miOtraLista.get(4)) / miOtraLista.size();
        if (media >= 5) {
            System.out.println("aprobado");
        } else  {
            System.out.println("suspenso");
        }

        // ejercicio 3
        ArrayList<String> colores = new ArrayList<>();
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("amarillo");
        colores.add("morado");
        Scanner sc = new Scanner(System.in);
        System.out.println("Registre un color");
        String color = sc.nextLine();
        if (colores.contains(color)){
            System.out.println("El color está en la lista");
        } else{
            System.out.println("El color no está en la lista");
        }

        // ejercicio 4
        HashSet<String> miset = new HashSet<>();
        miset.add("36788828M");
        miset.add("37899902N");
        miset.add("28766645I");
        miset.add("91877726T");
        miset.add("36788828M");
        System.out.println(miset.size());
        System.out.println(miset.contains("36788828M"));

        // ejercicio 5
        HashSet<String> miset2 = new HashSet<>();
        miset2.add("terry");
        miset2.add("manuel");
        miset2.add("nerea");
        miset2.add("isabel");
        miset2.add("alba");

        Scanner nombreUsuario = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String nombre = nombreUsuario.nextLine();
        if (miset2.contains(nombre)) {
            System.out.println("Ya existe");
        } else  {
            miset2.add(nombre);
            System.out.println(miset2);
        }

        // ejercicio 6
        HashSet<Integer> misetdenumeros1 = new HashSet<>();
        HashSet<Integer> misetdenumeros2 = new HashSet<>();
        misetdenumeros1.add(1);
        misetdenumeros1.add(2);
        misetdenumeros1.add(3);
        misetdenumeros2.add(1);
        misetdenumeros2.add(2);
        if (misetdenumeros1.size() > misetdenumeros2.size()){
            System.out.println("La lista más larga es " + misetdenumeros1);
        } else  {
            System.out.println("La lista más larga es " + misetdenumeros2);
        }
    }
}