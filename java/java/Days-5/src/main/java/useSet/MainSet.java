package useSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {

        ArrayList<String> ls = new ArrayList<>();
        ls.add("İstanbul");
        ls.add("İstanbul");
        ls.add("İstanbul");
        ls.add("Ankara");
        ls.add("Ankara");
        ls.add("İzmir");
        ls.add("Antalya");
        System.out.println(ls);

        Set<String> set = new HashSet<>();
        set.add("İstanbul");
        set.add("İstanbul");
        set.add("İstanbul");
        set.add("Ankara");
        set.add("Ankara");
        set.add("İzmir");
        set.add("Antalya");
        System.out.println(set);

        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("İstanbul");
        linkedSet.add("İstanbul");
        linkedSet.add("İstanbul");
        linkedSet.add("Ankara");
        linkedSet.add("Ankara");
        linkedSet.add("İzmir");
        linkedSet.add("Antalya");
        System.out.println(linkedSet);

    }

}
