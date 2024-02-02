package useAbstract;

public class MainAbstract {

    public static void main(String[] args) {

        Employee employee = new Employee(100);
        System.out.println( employee.customerName() );
        System.out.println( employee.total() );

    }


}
