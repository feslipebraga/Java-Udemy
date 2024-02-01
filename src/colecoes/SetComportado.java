package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet; 

public class SetComportado { 
    public static void main(String[] args) {
        
        // DADOS HOMOGÊNEOS (mesmo tipo)

        Set<String> listaAprovados = new HashSet<String>(); // adiciona de forma aleatória
        listaAprovados.add("Maria");
        listaAprovados.add("Pietra");
        listaAprovados.add("Felipe");
        listaAprovados.add("Andrey");

        System.out.println("LISTA DE APROVADOS");
        for (String i : listaAprovados) {
            System.out.println(i);
        }

        Set<String> listaAprovados2 = new TreeSet<>();    // adiciona em ordem alfabética
        listaAprovados2.add("Maria");
        listaAprovados2.add("Pietra");
        listaAprovados2.add("Felipe");
        listaAprovados2.add("Andrey");

        System.out.println("LISTA DE APROVADOS");
        for (String i : listaAprovados2) {
            System.out.println(i);
        }
    }
}
