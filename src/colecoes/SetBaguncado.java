package colecoes;

import java.util.HashSet;
import java.util.Set;

public class SetBaguncado {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) {
        // Nesse set irão ser adicionados elementos de vários tipos primitivos
        // HASHSET NÃO ADICIONA ELEMENTOS REPETIDOS

        HashSet conjunto = new HashSet();

        // converte atritubos primitivos para objetos automaticamente
        conjunto.add(1);
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        // retorna o tamanho do set
        System.out.println(conjunto.size());

        // remove um objeto
        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.size());

        // contem o valor?
        System.out.println(conjunto.contains('x'));


        // Criando outro set
        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

       conjunto.addAll(nums); // une dois sets

        System.out.println(conjunto);

        // deixa somente os valores em comum entre os 2 sets
        conjunto.retainAll(nums);

        System.out.println(conjunto);

    }
}
