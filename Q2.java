import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        // Define a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");
        strings.add("elderberry");
        strings.add("fig");
        strings.add("grape");

        // Create a custom comparator using a lambda expression
        Comparator<String> lengthComparator = (s1, s2) -> Integer.compare(s2.length(), s1.length());

        // Sort the list using the custom comparator
        strings.sort(lengthComparator);

        // Print the sorted list
        System.out.println("Sorted list based on length (descending order):");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
