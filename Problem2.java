import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by PC-PC on 3/31/2016.
 */
public class Problem2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        List<String> array = Arrays.asList(console.nextLine().split(" "));
        String commnd = console.nextLine();

        if (commnd.equals("Ascending")) {
            List<Integer> numbArray = array.stream().map(p -> Integer.parseInt(p)).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
            System.out.println(numbArray);
        }else{
            List<Integer> numbArray = array.stream().map(p -> Integer.parseInt(p)).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
            System.out.println(numbArray);
        }



    }
}
    //String[] arrayOfStrings = console.nextLine().toString().split(" ");
    //List<String> newArray = Arrays.asList(arrayOfStrings).stream().filter(p -> p.length() > 3).collect(Collectors.toList());
