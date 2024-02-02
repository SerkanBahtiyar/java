public class MainArr {

    public static void main(String[] args) {

        // Array
        String[] cities = {"İstanbul", "İzmir", "Ankara", "Adana", "Bursa", "Samsun", "Ardahan"};

        // get item
        // index -> 0 dan başlar
        System.out.println( cities[5] );

        // size
        int size = cities.length;
        System.out.println("Size: " + size);

        int index = -1;
        if ( index > -1 && size > index ) {
            System.out.println( cities[index] );
        }

        cities[3] = "Antalya";
        System.out.println( cities[3] );

        String start = "";
        for (int i = 0; i < 10; i++ ) {
            start = start + "*";
            System.out.println(start);
        }
        System.out.println("This line call");

        System.out.println("================== for =================");
        for (int i = 3; i < size; i++) {
            System.out.println( cities[i] );
        }

        System.out.println("================== foreach =================");
        for ( String item : cities ) {
            System.out.println(item);
        }

        System.out.println("================== for - continue - break  =================");
        for (int i = 0; i < size; i++) {
            String item = cities[i];
            if (i == 2) {
                continue;
            }
            System.out.println(item);
            if (item.equals("Bursa")) {
                break; // Döngüyü durdur
            }
        }


        System.out.println("================== for in for - break  =================");
        label : for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i: " +i  + " j: " + j);
                if (j == 5) {
                    break label;
                }
            }
        }

    }

}
