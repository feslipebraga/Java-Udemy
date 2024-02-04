package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Príncipe");
        livros.push("Don Quixote");
        livros.push("O hobbit");

        System.out.println(livros.peek()); // mostra o topo
        livros.element(); //também

        // excluir:
        livros.poll();
        livros.remove();
        livros.pop();

       System.out.println(livros.poll()); // remove o primeiro elemento da pilha
    
       livros.size();
       livros.clear();
       livros.contains("O");
       livros.isEmpty();
    }
}
