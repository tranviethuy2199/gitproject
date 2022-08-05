package ss4_class_and_object.homeWork.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatchButton stop = new StopWatchButton();
        stop.startTime();
        System.out.println("đếm thời gian :");
        for (int i = 1; i < 1000000; i++) {
            stop.endTime();
            stop.getElapsedTime();

        }

    }
}
