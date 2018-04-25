package Zadania.Assignment9;

public abstract class Activity {

    public abstract void onCreate();

    public void onPause() {
        System.out.println("Activity paused!");
    }

    public void onStop() {
        System.out.println("Activity stoped!");
    }
}
