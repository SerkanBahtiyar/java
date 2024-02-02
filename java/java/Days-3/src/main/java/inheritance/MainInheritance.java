package inheritance;

public class MainInheritance {

    public static void main(String[] args) {

        A nsa = new A();
        B nsb = new B();
        C nsc = new C();

        fncCall(nsa);
        fncCall(nsb);
        fncCall(nsc);

    }

    public static void fncCall( Base base ) {
        if ( base instanceof A ) {
            A a = (A) base;
            a.getColor(10);
        }
        System.out.println(base.hashCode());
        base.call();
    }


}
