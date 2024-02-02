package usefile;

import permission.Profile;

public class MainFile {

    public static void main(String[] args) {

        Manager manager = new Manager();
        //manager.createFile();
        //manager.deleteFile();
        //manager.addLine("New Data - 3");
        manager.readFile();

        Profile.city = "Ankara";

    }

}
