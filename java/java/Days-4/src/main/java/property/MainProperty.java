package property;

public class MainProperty {

    public static void main(String[] args) {

        Product p1 = new Product();
        p1.setPid(1);
        p1.setTitle("TV");
        p1.setDetail("TV Detail");
        p1.setPrice(10000);
        p1.setStatus(true);

        Product p2 = new Product();
        p2.setPid(2);
        p2.setTitle("iPhone 15");
        p2.setDetail("iPhone 15 Detail");
        p2.setPrice(55000);
        p2.setStatus(false);

        Product p3 = new Product();
        p3.setPid(2);
        p3.setTitle("Samsung");
        p3.setDetail("Samsung Detail");
        p3.setPrice(45000);
        p3.setStatus(true);

        Product[] arr = {p1, p2, p3};
        for ( Product item : arr ) {
            // System.out.println( item.getTitle() + " - " + item.getPrice() + " - " + item.isStatus()  );
            System.out.println(item);
        }


    }

}
