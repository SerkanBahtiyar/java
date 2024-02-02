package useThread;

public class Action extends Thread {

    private String imagePath = "";
    public Action(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i< 10; i++) {
                Thread.sleep(500);
                System.out.println("Image  Upload: " + imagePath);
            }
            System.out.println(imagePath + " Upload Finish!");
        }catch (Exception ex) {}
    }

}
