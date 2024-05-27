import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Q11 {
    public static void main(String[] args) {
        // Define a string representing a date and time in UTC format
        String utcDateTimeString = "2023-05-27T14:30:45Z";
        
        // Parse the string to an Instant
        Instant instant = Instant.parse(utcDateTimeString);
        
        // Define the desired time zone (e.g., "America/New_York")
        ZoneId zoneId = ZoneId.of("America/New_York");
        
        // Convert the Instant to a ZonedDateTime in the specific time zone
        ZonedDateTime zonedDateTime = instant.atZone(zoneId);
        
        // Define the desired format for the output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        
        // Format the ZonedDateTime to the desired string format
        String formattedDateTime = zonedDateTime.format(formatter);
        
        // Print the formatted date and time
        System.out.println("Local DateTime in " + zoneId + ": " + formattedDateTime);
    }
}
