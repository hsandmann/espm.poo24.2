package espm.aula08;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListaDinamica {

    public static void main(String[] args) {

        List<Integer> lista1 = new ArrayList<>();
        lista1.add(4);
        lista1.add(5);
        lista1.add(4);
        System.out.println(lista1 + " #" + lista1.size());

        Set<Integer> conjunto = new TreeSet<>();
        conjunto.add(7);
        conjunto.add(3);
        conjunto.add(7);
        System.out.println(conjunto + " #" + conjunto.size());
        
    }
    
}
