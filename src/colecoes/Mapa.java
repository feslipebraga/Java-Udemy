package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
    public static void main(String[] args) {
        
        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Roberto");
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Rebeca"));

        System.out.println(usuarios.get(4));
        System.out.println(usuarios.remove(1));

        for (int i : usuarios.keySet()) {
            System.out.println(i);
        }

        for (String i : usuarios.values()) {
            System.out.println(i);
        }

        for(Entry<Integer, String> i: usuarios.entrySet()){
            System.out.println(i.getKey());
            System.out.println(i.getValue());
        }
    }
}
