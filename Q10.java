import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q10 {
    public static void main(String[] args) {
        // Define a LocalDateTime object representing a specific date and time
        LocalDateTime dateTime = LocalDateTime.of(2023, 5, 27, 14, 30, 45);

        // Define the desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format the LocalDateTime object to the desired string format
        String formattedDateTime = dateTime.format(formatter);

        // Print the formatted date and time
        System.out.println("Formatted DateTime: " + formattedDateTime);
    }
}
