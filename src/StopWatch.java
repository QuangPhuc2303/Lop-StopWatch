import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        Date now = new Date();
        startTime = now;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void stop() {
        Date now = new Date();
        endTime = now;
    }

    public void start() {
        Date now = new Date();
        startTime = now;
    }

    public double getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
}
