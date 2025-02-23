//ZonedDateTime Write a program that displays the current
//time in different time zones:
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
public class timezone{
    public static void main(String[] args) {
        // Get current time in GMT (Greenwich Mean Time)
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));

        // Get current time in IST (Indian Standard Time)
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata")); // IST is "Asia/Kolkata" in ZoneId

        // Get current time in PST (Pacific Standard Time)
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles")); // PST is "America/Los_Angeles" in ZoneId

        // Print the times
        System.out.println("Current Time in GMT: " + gmtTime);
        System.out.println("Current Time in IST: " + istTime);
        System.out.println("Current Time in PST: " + pstTime);

    }
}