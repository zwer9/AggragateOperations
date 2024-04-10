import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void sortowanieLiczb() {
        ToIntFunction<Integer> func = integer -> integer;

        Random rand = new Random();
        Set<Integer> setOfNums = Stream
                .generate(() -> rand.nextInt(9) + 1)
                .limit(10)
                .collect(Collectors.toSet());
        setOfNums
                .stream()
                .sorted((a,b) -> b - a)
                .forEach(System.out::println);
    }


    public static void main(String[] args) {
        sortowanieLiczb();
    }
}