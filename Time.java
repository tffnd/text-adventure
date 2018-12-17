/**
 * Timer that I ended up implementing into the Game class.
 */
public class Time
{
    // instance variables - replace the example below with your own
    private int x;
    private double startingTime;
    private final double SEC_MIN = 60.0;
    private final int MIL_SEC = 1000;
    private final int HOUR_DAY = 24;
    private final double PLAY_MIN = 5.0; //playing time

    /**
     * Constructor for objects of class Timer
     */
    public Time()
    {
        startingTime = System.currentTimeMillis();
    }

    
    public void printTime()
    {
        double timeElapsed = (System.currentTimeMillis()/MIL_SEC - startingTime/MIL_SEC);
        double elapsedTimeInMinutes = timeElapsed / SEC_MIN;
        double timeInHours = (elapsedTimeInMinutes*(HOUR_DAY) / PLAY_MIN);
        int day = (int) (timeInHours / HOUR_DAY);
        int hours = (int)(timeInHours - (day*HOUR_DAY));
        int minutes = (int)((timeInHours - (day *HOUR_DAY) - hours)*SEC_MIN);
        System.out.println("Time elapsed: " + day + " Days, " + hours + " hours, and " + minutes + " minutes.");
    }

}
