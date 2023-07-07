import java.util.Scanner;

class HourException extends Exception {
    public HourException(String message) {
        super(message);
    }
}

class MinuteException extends Exception {
    public MinuteException(String message) {
        super(message);
    }
}

class SecondException extends Exception {
    public SecondException(String message) {
        super(message);
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) throws HourException, MinuteException, SecondException {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void setHours(int hours) throws HourException {
        if (hours < 0 ||  hours > 24) {
            throw new HourException("Hour should be between 0 and 24");
        }
        this.hours = hours;
    }

    public void setMinutes(int minutes) throws MinuteException {
        if (minutes < 0 || minutes > 60) {
            throw new MinuteException("Minute should be between 0 and 60");
        }
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) throws SecondException {
        if (seconds < 0 || seconds > 60) {
            throw new SecondException("Second should be between 0 and 60");
        }
        this.seconds = seconds;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter time in hh:mm:ss format: ");
        String[] time = scanner.nextLine().split(":");
        scanner.close();
        try {
            Time t = new Time(Integer.parseInt(time[0]), Integer.parseInt(time[1]), Integer.parseInt(time[2]));
            System.out.println("Time entered: " + t);
        } catch (HourException | MinuteException | SecondException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid time format. Please enter time in hh:mm:ss format.");
        }
    }
}