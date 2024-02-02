package mainApp;


import java.util.Scanner;

public class UseScanner {

    public static void main(String[] args) {

        // Scanner Sınıfı
        // Output ekranında kullanıcıdan veri almak için kullanılır.
        Scanner read = new Scanner(System.in);
        Scanner readNumber = new Scanner(System.in);

        System.out.println("Name?");
        String name = read.nextLine();

        System.out.println("Number-1");
        int num1 = readNumber.nextInt();

        System.out.println("Number-2");
        int num2 = readNumber.nextInt();

        int sum = num1 + num2;

        System.out.println("name: " + name + " Sum: " + sum);

    }

}
