package EstructuraDeDatos_lll;
import java.util.*;

public class EjercicioDeListaSimple_1 {
    public static void main(String[] args) {
        // Crear una lista simple de frutas
        String[] listaFrutas = {"manzana", "plátano", "naranja", "pera"};

        // Imprimir el primer elemento de la lista
        System.out.println(listaFrutas[0]);

        // Imprimir el segundo elemento de la lista
        System.out.println(listaFrutas[1]);

        // Imprimir el tercer elemento de la lista
        System.out.println(listaFrutas[2]);

        // Imprimir el cuarto elemento de la lista
        System.out.println(listaFrutas[3]);

        // Agregar un nuevo elemento al final de la lista
        String[] nuevaListaFrutas = Arrays.copyOf(listaFrutas, listaFrutas.length + 1);
        nuevaListaFrutas[nuevaListaFrutas.length - 1] = "uva";
        System.out.println(Arrays.toString(nuevaListaFrutas));

        // Eliminar el último elemento de la lista
        String[] listaFrutasActualizada = Arrays.copyOf(nuevaListaFrutas, nuevaListaFrutas.length - 1);
        System.out.println(Arrays.toString(listaFrutasActualizada));
    }
}
