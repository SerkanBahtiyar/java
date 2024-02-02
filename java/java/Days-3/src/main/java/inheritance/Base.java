package inheritance;

public class Base {

    public void call() {
        minus(0,0);
    }

    public void sum( int num1, int num2 ) {
        int sm = num1 + num2;
        System.out.println("Sum: " + sm);
    }

    public void minus( int num1, int num2 ) {
        int min = num1 - num2;
        System.out.println("Min: " + min);
    }

}
