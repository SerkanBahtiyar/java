package inheritance;

public class A extends Base {

    @Override
    public void call() {
        sum(40, 95);
    }

    public void getColor(int id) {
        if (id == 10) {
            super.call();
        }else {
            call();
        }
    }

}
