package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        fila.add("Ana"); // retorna erro se fila com restrição
        fila.offer("Bia"); // retorna false se fila com restrição
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        System.out.println(fila.peek()); // retorna null se vazia
        System.out.println(fila.element()); // retorna erro se vazia

        // outras funcoes
        fila.size(); 
        fila.clear();
        fila.isEmpty();
        fila.contains("Gui");

        // obtem o proximo elemento da fila e remove
        fila.poll();
        fila.remove();

        for (String string : fila) {
            System.out.println(string);
        }
    }
}
