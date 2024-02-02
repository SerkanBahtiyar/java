package mainApp;

public class UseIf {

    public static void main(String[] args) {

        // if -> karar kontrol yapısı
        int num1 = 40;
        int num2 = 45;

        // karar kontrol
        boolean status = num1 > num2;
        System.out.println("num1 > num2 : " + status);

        status = num1 < num2;
        System.out.println("num1 < num2 : " + status);

        status = num1 != num2;
        System.out.println("num1 != num2 : " + status);

        status = num1 == num2;
        System.out.println("num1 == num2 : " + status);

        status = num1 >= num2;
        System.out.println("num1 >= num2 : " + status);

        status = num1 <= num2;
        System.out.println("num1 <= num2 : " + status);

        // if
        if ( num2 > num1 ) {
            System.out.println("num2 > num1 : true ");
        }

        if (num1 > num2) {
            System.out.println("num1 > num2 : true ");
        }else {
            System.out.println("num1 > num2 : false ");
        }

        // && ||
        // && -> sol taraf ile sağ taraftaki tüm şartların sağlamnması durumu
        // || -> sol taraf ile sağ taraftaki herhangi bir koşulun sağlanmması durumu
        if (num2 > num1 && num2 > 50) {
            System.out.println("&& if status: true");
        }else {
            System.out.println("&& if status: false");
        }

        if ( num2 > 50 || num1 > 30 ) {
            System.out.println("|| if status : true");
        }else {
            System.out.println("|| if status : false");
        }


    }


}
