import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConvertUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "", "banana", " ", "cherry");

        List<String> res = list.stream()
                .map(String::trim)                      // remove leading/trailing spaces
                .filter(s -> !s.isEmpty())              // filter out empty strings
                .map(String::toUpperCase)               // convert to uppercase
                .collect(Collectors.toList());

        System.out.println(res);

    }
}
