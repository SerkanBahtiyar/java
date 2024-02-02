package useAbstract;

public class Employee extends Customer{

    int number = 0;
    public Employee(int number) {
        this.number = number;
    }

    @Override
    public int accountNumber() {
        return number;
    }

}
