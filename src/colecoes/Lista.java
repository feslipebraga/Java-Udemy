package colecoes;

import java.util.ArrayList;

public class Lista {
    // é ordenado e INDEXADO (acesso pelo índice)
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
    
        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        Usuario u1 = new Usuario("Felipe");
        lista.add(u1);

        System.out.println(lista.get(0).getNome()); // acesso pelo índice
       
        lista.remove(0);
        lista.remove(new Usuario("Carlos")); // sem o hashCode não funciona

        for (Usuario usuario : lista) {
            System.out.println(usuario.toString());
        }

        System.out.println(lista.contains(u1));
    }
}
