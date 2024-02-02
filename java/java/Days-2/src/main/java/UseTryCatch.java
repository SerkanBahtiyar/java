import java.io.File;

public class UseTryCatch {

    public static void main(String[] args) {

        String stAge = "30";
        try {
            int age = Integer.parseInt(stAge);
            age += 10; // age = age + 10
            System.out.println("Age: " + age);
        }catch (Exception ex) {
            System.err.println(ex);
            System.out.println("Lütfen sadece tam sayı giriniz!");
        }

        File file = new File("sample.txt");
        try {
            file.createNewFile();
        }catch (Exception ex) {
            System.err.println(ex);
        }finally {
            file.exists();
        }


        System.out.println("This line call");
    }

}
