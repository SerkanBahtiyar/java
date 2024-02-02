public class OOPMain {


    public static void main(String[] args) {

        // OOP
        // Nesne üretimi
        Action objAction = new Action();
        objAction.number = 40;
        System.out.println( objAction.hashCode() );
        System.out.println( objAction.number );

        Action objAction1 = new Action();
        System.out.println( objAction1.hashCode() );
        System.out.println( objAction1.number );

        // Void fnc call
        objAction.fncVoid();

        // Params fnc call
        objAction.fncParams(30, 60);
        objAction.fncParams(21, 66);
        objAction.fncParams(77, 890);

        for (int i = 0; i < 10; i++) {
            objAction.fncParams(i, i * i);
        }

        int minus = objAction.minus(77, 44);
        if (minus > 10) {
            System.out.println("minus > 10");
        }else {
            System.out.println("minus < 10");
        }

        String[] users = {"zehra", "mehmet", "ahmet", "ali", "kemal", "kaan"};
        users = objAction.arrUpperCase(users);
        for (String item : users) {
            System.out.println(item);
        }

        String params = objAction.addLines("İstanbul", "Bakırköy", "Zuhurat Baba Mah.", "No:13", "C Blok");
        System.out.println(params);

        Profile profile = new Profile();
        objAction.fncObj(profile);
        System.out.println( profile.userName() );

        Profile pro1 = objAction.fncChangeName("Zehra Bilirler");
        System.out.println( pro1.userName() );
        System.out.println( pro1.surname );
        System.out.println( pro1.age );
        System.out.println( pro1.ondalik1 );
        System.out.println( pro1.status );

    }

}
