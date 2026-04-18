/**
 * Clase que proporciona métodos estáticos para la manipulación y procesamiento de colecciones numéricas.
 * * @author Diego Dario Figueroa Mejia
 */
import java.util.*;
import java.util.stream.Collectors;

public class CalculadoraNumerica {

    // 1. El Multiplicador
    public static void multiplicarElementos(ArrayList<Integer> lista, int factor) {
        if (lista == null) return;
        lista.replaceAll(n -> n * factor);
    }

    // 4. Cuadrados Únicos
    public static HashSet<Integer> obtenerCuadradosParesUnicos(ArrayList<Integer> lista) {
        if (lista == null) return new HashSet<>();
        return lista.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toCollection(HashSet::new));
    }
}