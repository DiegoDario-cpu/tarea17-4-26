/**
 * Clase pruebas para demostrar el funcionamiento de todos los métodos. Muestra resultados antes y después
 * * @author Diego Dario Figueroa Mejia
 */
import java.util.*;

public class Main {
        public static void main(String[] args) {
                System.out.println("= INICIO DE PRUEBAS DE LABORATORIO =\n");

                System.out.println("1. El Multiplicador (ArrayList)");
                ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 5, 10));
                System.out.println("Antes: " + nums1);
                CalculadoraNumerica.multiplicarElementos(nums1, 2);
                System.out.println("Después (*2): " + nums1);

                System.out.println("\n2. El Filtro Selectivo (ArrayList) ");
                ArrayList<String> palabras2 = new ArrayList<>(Arrays.asList("Hola", "Java", "A", "Sol", "Avanzado"));
                System.out.println("Antes: " + palabras2);
                ProcesadorCadenas.filtrarCadenas(palabras2, 'A', 4);
                System.out.println("Después (Sin iniciar con 'A' o largo < 4): " + palabras2);

                System.out.println("\n3. Conversor de Mayúsculas (Stream/Map)");
                ArrayList<String> palabras3 = new ArrayList<>(Arrays.asList("programación", "funcional"));
                System.out.println("Antes: " + palabras3);
                ArrayList<String> resultado3 = ProcesadorCadenas.convertirAMayusculas(palabras3);
                System.out.println("Después: " + resultado3);

                System.out.println("\n4. Cuadrados Únicos (HashSet/Filter)");
                ArrayList<Integer> nums4 = new ArrayList<>(Arrays.asList(2, 3, 2, 4, 5, 6, 6));
                System.out.println("Original (con duplicados e impares): " + nums4);
                HashSet<Integer> resultado4 = CalculadoraNumerica.obtenerCuadradosParesUnicos(nums4);
                System.out.println("Después (Pares al cuadrado únicos): " + resultado4);

                System.out.println("\n5. Mapa de Longitudes (Collectors.toMap)");
                ArrayList<String> palabras5 = new ArrayList<>(Arrays.asList("Java", "Lambda", "Code"));
                System.out.println("Lista: " + palabras5);
                HashMap<String, Integer> resultado5 = ProcesadorCadenas.mapearLongitudes(palabras5);
                System.out.println("Mapa Resultante: " + resultado5);

                System.out.println("\n6. Modificador de Inventario (forEach/Bi-Consumer)");
                HashMap<String, Double> inventario = new HashMap<>();
                inventario.put("Monitor", 3000.0);
                inventario.put("Teclado", 800.0);
                System.out.println("Mostrando catálogo con 10% de descuento aplicado en impresión:");
                ProcesadorCadenas.imprimirCatalogoConDescuento(inventario);

                System.out.println("\n7. Contador de Frecuencias (Merge/Compute)");
                ArrayList<String> palabras7 = new ArrayList<>(Arrays.asList("uno", "dos", "uno", "tres", "dos", "uno"));
                System.out.println("Lista de palabras: " + palabras7);
                HashMap<String, Integer> resultado7 = ProcesadorCadenas.contarFrecuencias(palabras7);
                System.out.println("Frecuencias: " + resultado7);

                System.out.println("\n8. Clasificador de Palabras (EntrySet Stream)");
                System.out.println("Mapa base: " + resultado7);
                ArrayList<String> resultado8 = ProcesadorCadenas.filtrarPorFrecuencia(resultado7, 2);
                System.out.println("Palabras con frecuencia >= 2: " + resultado8);

                System.out.println("\n9. Deduplicación de Palabras (Stream/Filter)");
                String frase = "Java es genial y Java es potente";
                System.out.println("Frase: \"" + frase + "\"");
                HashSet<String> resultado9 = ProcesadorCadenas.procesarFrase(frase, 3);
                System.out.println("Palabras únicas (largo >= 3): " + resultado9);

                System.out.println("\n10. El Tope de Frecuencias (ReplaceAll)");
                HashMap<String, Integer> freqs10 = new HashMap<>();
                freqs10.put("A", 10);
                freqs10.put("B", 2);
                freqs10.put("C", 15);
                System.out.println("Antes (Tope máximo 5): " + freqs10);
                ProcesadorCadenas.limitarFrecuencias(freqs10, 5);
                System.out.println("Después: " + freqs10);

                System.out.println("\n=== FIN DE PRUEBAS ===");
        }
}