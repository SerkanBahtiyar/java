package useArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainArrayList {

    public static void main(String[] args) {

        String[] arr1 = {};
        ArrayList<String> list = new ArrayList<>();

        // Add Item
        list.add("İstanbul");
        list.add("Ankara");
        list.add("İzmir");
        list.add("Adana");
        list.add("Hatay");
        list.add("Samsun");

        // Add index item
        list.add(2, "Antalya");

        // size
        int size = list.size();
        System.out.println(size);

        // get item
        System.out.println( list.get(5) );

        System.out.println(list);

        // remove item
        //list.remove(0);
        //list.remove("Antalya");
        //list.clear();
        list.set(5, "Antakya");
        System.out.println(list);

        System.out.println("==========================");
        for ( String item : list ) {
            System.out.println(item);
        }

        System.out.println("==========================");
        for (int i = 2; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println(item);
        }

        System.out.println("==========================");
        boolean status = list.contains("İstanbul");
        System.out.println("İstanbul Status: " + status);


        int index = list.indexOf("İzmir");
        System.out.println("İzmir index: " + index);

        System.out.println("List is Empty: " + list.isEmpty());

        // Sort
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        // Propery Array List
        ArrayList<User> users = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            User u = new User();

            System.out.println("User ID?");
            int id = scanner.nextInt();
            u.setId(id);
            scanner.nextLine();

            System.out.println("User Name?");
            String name = scanner.nextLine();
            u.setName(name);

            System.out.println("User Email?");
            String email = scanner.nextLine();
            u.setEmail(email);

            users.add(u);

            System.out.println("Exit? (E) -> enter");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("e")) {
                break;
            }
        }

        System.out.println(users);

    }

}
