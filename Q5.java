import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args) {
        // Define a list of strings
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "umbrella", "kiwi");

        // Process the strings
        List<String> result = strings.stream()
            // Convert to uppercase
            .map(String::toUpperCase)
            // Filter out strings starting with a vowel
            .filter(s -> !s.matches("^[AEIOU].*"))
            // Collect the results into a list
            .collect(Collectors.toList());

        // Print the remaining strings
        result.forEach(System.out::println);
    }
}
