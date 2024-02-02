package usefile;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Manager {

    File file = null;
    String folderName = "notes/";

    public Manager() {
        createFolder();
        LocalDateTime local = LocalDateTime.now();
        String stDate = local.getDayOfMonth() + "_" + local.getMonthValue() + "_" +  local.getYear();
        String path = folderName+stDate+".txt";
        file = new File(path);
    }

    public Manager( String fileName ) {
        createFolder();
        String path = folderName + fileName + ".txt";
        file = new File(path);
    }

    public void createFolder() {
        File file = new File(folderName);
        if (!file.isDirectory()) {
            try {
                file.mkdirs();
            }catch (Exception ex) {
                System.err.println("createFolder :" + ex);
            }
        }
    }

    public void createFile() {
        try {
            file.createNewFile();
        }catch (Exception ex) {
            System.err.println("createFile: " + ex);
        }
    }

    public void deleteFile() {
        file.delete();
    }

    public void addLine( String line ) {
        try {
            LocalDateTime local = LocalDateTime.now();
            String time = local.getHour() + ":" + local.getMinute() + ":" + local.getSecond();
            String stDate = local.getDayOfMonth() + "-" + local.getMonthValue() + "-" +  local.getYear() + " " + time;
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.append(stDate + " -> " + line);
            fileWriter.append( System.lineSeparator() );
            fileWriter.close();
        }catch (Exception ex) {
            System.err.println("addLine :" + ex);
        }
    }


    public void readFile() {
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (Exception ex) {
            System.err.println("readFile :" + ex);
        }
    }


}
