import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static <Int> void main(String[] args) {
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
        } else if (misetdenumeros1.size() < misetdenumeros2.size()){
            System.out.println("La lista más larga es " + misetdenumeros2);
        } else {
            System.out.println("Las listas son iguales");
        }


        //ejercicio 7
        HashMap<String, Integer> personas = new HashMap<String, Integer>();
        personas.put("Brandon", 3);
        personas.put("Carlos", 2);
        personas.put("Daniel", 1);
        personas.put("Nerea", 4);
        personas.put("Isabel", 5);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String nombrePedido = sc2.nextLine();
        if (personas.containsKey(nombrePedido)) {
            int edad = personas.get(nombrePedido);
            boolean esMayor = edad > 18;
            System.out.println("Edad: " + edad);
            System.out.println("¿Es mayor de edad?: " + esMayor);
            }


        //ejercicio 8
        HashMap<String, Double> alumnos = new HashMap<String, Double>();
        alumnos.put("Brandom", 9.5);
        alumnos.put("Carlos", 7.5);
        alumnos.put("Daniel", 5.75);
        alumnos.put("Nerea", 4.25);
        alumnos.put("Isabel", 5.5);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String nombrePedido2 = sc3.nextLine();
        if (alumnos.containsKey(nombrePedido2)) {
            double notaMedia = alumnos.get(nombrePedido2);
            boolean aprobado =  notaMedia >= 5;
            System.out.println("El alumno " + nombrePedido2 + " es " + notaMedia);
            System.out.println("¿El alumno está aprobado?: " + aprobado);
        }

        //ejercicio 9
        HashMap<String, String> usuarios = new HashMap<String, String>();
        usuarios.put("Brandon", "Brandon");
        usuarios.put("Carlos", "Carlos");
        usuarios.put("Daniel", "Daniel");
        usuarios.put("Nerea", "Nerea");
        usuarios.put("Isabel", "Isabel");
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        String nombrePedido3 = sc4.nextLine();
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Ingrese una contraseña: ");
        String contraseñaPedida = sc5.nextLine();
        if (usuarios.containsKey(nombrePedido3) && usuarios.get(nombrePedido3).equals(contraseñaPedida)) {
            System.out.println("Login correcto");
        } else  {
            System.out.println("Usuario y/o contraseña incorrecta");
        }
    }
}