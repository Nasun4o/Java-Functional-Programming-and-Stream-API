import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.*;

/**
 * Created by PC-PC on 3/31/2016.
 */
public class Problem1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String[] arrayOfStrings = console.nextLine().toString().split(" ");
        List<String> newArray = Arrays.asList(arrayOfStrings).stream().filter(p -> p.length() > 3).collect(Collectors.toList());

            if (newArray.isEmpty())
            {
                System.out.printf("(empty)", newArray.toString().replaceAll("[\\[\\]]", ""));
            }

            System.out.println(newArray.toString().replaceAll("[\\[\\]]", ""));



    }
}
