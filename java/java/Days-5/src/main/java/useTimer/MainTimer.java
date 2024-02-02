package useTimer;

import java.util.Timer;

public class MainTimer {

    public static void main(String[] args) {

        DataManager dataManager = new DataManager();
        Timer timer = new Timer();
        timer.schedule(dataManager, 0, 10000);
    }

}
