// importamos Scanner 
import java.util.Scanner;

public class Codigo6 {
  public static void main(String[] args) { // no estaba el método main

    int[] n = new int[20]; // corregimos la sintaxis para crear un arreglo de enteros

    for (int i = 0; i < 20; i++) { // corregimos el incremento (de i+ a i++)
      n[i] = (int)(Math.random() * 381) + 20; // para conseguir números aleatorios entre 20 y 400
      System.out.print(n[i] + " "); // corregimos System.print a System.out.print
    }

    // corregimos "printl" a "println"
    System.out.println("\n¿Qué números quiere resaltar? ");
    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");

    Scanner s = new Scanner(System.in); // usamos Scanner en lugar de System.console() para mayor compatibilidad
    int opcion = s.nextInt(); // cerramos correctamente el paréntesis y usamos Scanner

    // corregimos el operador ternario que estaba al revés (: en lugar de ?)
    int multiplo = (opcion == 1) ? 5 : 7;

    // cambiamos foreach incorrecto por for-each válido y el tipo char por int (porque n es int[])
    for (int e : n) {
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");
      } else {
        System.out.print(e + " "); // corregimos System.in.print a System.out.print
      }
    }
  }
}
