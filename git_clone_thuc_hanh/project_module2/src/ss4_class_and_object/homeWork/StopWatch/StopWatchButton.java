package ss4_class_and_object.homeWork.StopWatch;

import java.time.LocalTime;
import java.util.Locale;

public class StopWatchButton {
    private static LocalTime endTime;
    private static LocalTime startTime;
//    LocalTime startTime, endTime;

    public StopWatchButton() {
    }

    ;

//    public StopWatchButton(LocalTime startTime, LocalTime endTime) {
//        StopWatchButton.startTime = startTime;
//        StopWatchButton.endTime = endTime;
//    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return (endTime);
    }

    public static void getElapsedTime() {
        int ElaspedTime = (endTime.toSecondOfDay()-startTime.toSecondOfDay()) * 1000;
        System.out.println("số mili giây đếm được là :" + ElaspedTime);
    }

    public void startTime() {
        startTime = LocalTime.now();
    }

    public void endTime() {
        endTime = LocalTime.now();
    }


}
