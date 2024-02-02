package useAbstract;

public abstract class Customer {

    public abstract int accountNumber();


    // Customer Name
    public String customerName() {
        int number = accountNumber();
        String name = "";
        if ( number == 100 ) {
            name = "Ali Bilmem";
        }
        if ( number == 200 ) {
            name = "Erkan Bilsin";
        }
        return name;
    }

    public int total() {
        int total = 0;
        int number = accountNumber();
        if (number == 100) {
            total = 1000000;
        }
        if (number == 200) {
            total = 2000000;
        }
        return total;
    }

}
