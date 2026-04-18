/**
 * Clase de utilidad enfocada en el procesamiento de cadenas de texto y gestión de estructuras de datos tipo Map y Set mediante expresiones lambda.
 * * @author Diego Dario Figueroa Mejia
 */
import java.util.*;
import java.util.stream.Collectors;

public class ProcesadorCadenas {

    // 2. El Filtro Selectivo
    public static void filtrarCadenas(ArrayList<String> lista, char letra, int n) {
        if (lista == null) return;
        lista.removeIf(s -> s == null || s.startsWith(String.valueOf(letra)) || s.length() < n);
    }

    // 3. Conversor de Mayúsculas
    public static ArrayList<String> convertirAMayusculas(ArrayList<String> lista) {
        if (lista == null) return new ArrayList<>();
        return lista.stream()
                .map(s -> s == null ? null : s.toUpperCase())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // 5. Mapa de Longitudes
    public static HashMap<String, Integer> mapearLongitudes(ArrayList<String> palabras) {
        if (palabras == null) return new HashMap<>();
        return palabras.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(
                        p -> p,
                        String::length,
                        (existente, reemplazo) -> existente,
                        HashMap::new
                ));
    }

    // 6. Modificador de Inventario
    public static void imprimirCatalogoConDescuento(HashMap<String, Double> inventario) {
        if (inventario == null) return;
        inventario.forEach((prod, precio) ->
                System.out.println("Producto: " + prod + " | Precio Original: " + precio + " | Con 10% desc: " + (precio * 0.9)));
    }

    // 7. Contador de Frecuencias
    public static HashMap<String, Integer> contarFrecuencias(ArrayList<String> palabras) {
        HashMap<String, Integer> mapa = new HashMap<>();
        if (palabras == null) return mapa;
        palabras.forEach(p -> mapa.merge(p, 1, Integer::sum));
        return mapa;
    }

    // 8. Clasificador de Palabras
    public static ArrayList<String> filtrarPorFrecuencia(HashMap<String, Integer> mapa, int minFrecuencia) {
        if (mapa == null) return new ArrayList<>();
        return mapa.entrySet().stream()
                .filter(e -> e.getValue() >= minFrecuencia)
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // 9. Deduplicación de Palabras
    public static HashSet<String> procesarFrase(String frase, int n) {
        if (frase == null) return new HashSet<>();
        return Arrays.stream(frase.split(" "))
                .filter(s -> s.length() >= n)
                .map(String::toLowerCase)
                .collect(Collectors.toCollection(HashSet::new));
    }

    // 10. El Tope de Frecuencias
    public static void limitarFrecuencias(HashMap<String, Integer> mapa, int max) {
        if (mapa == null) return;
        mapa.replaceAll((k, v) -> v > max ? max : v);
    }
}