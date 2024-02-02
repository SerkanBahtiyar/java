package useHashMap;

import java.util.HashMap;
import java.util.Set;

public class MainHashMap {

    public static void main(String[] args) {


        HashMap<String, Object> hm = new HashMap<>();

        // Add Item
        hm.put("id", 100);
        hm.put("id", 101);
        hm.put("name", "Erkan");
        hm.put("surname", "Bilsin");
        hm.put("status", true);
        hm.put("age", 35);

        // remove item
        Object objRemove = hm.remove("name");
        if (objRemove == null) {
            System.out.println("Not Found!");
        }else {
            System.out.println("Delete item Success");
        }

        Set<String> keys = hm.keySet();
        for ( String key : keys ) {
            System.out.println( key + " - " + hm.get(key) );
        }

        System.out.println("============================");
        hm.forEach( (k, v) -> {
            System.out.println( k + " - " + v );
        });

        // hm.clear();
        System.out.println( hm.size() );

        // Contains
        boolean statusKey = hm.containsKey("age");
        if (statusKey) {
            System.out.println("Not Empty!");
        }else {
            System.out.println("Empty!");
        }

        System.out.println(hm);
        System.out.println( hm.get("surname") );

    }

}
