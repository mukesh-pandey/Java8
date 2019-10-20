package stream.sum;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class SumDemo {
    public static void main (String args[]) {
        int sum = IntStream.range(1,11).sum();
        System.out.println(sum);

        int array []= {5,0,1};
        sum = Arrays.stream(array).sum();
        System.out.println(sum);

        List<Integer> integersList = Arrays.asList(1,4,5,6);
        sum = integersList.stream().mapToInt(Integer::intValue).sum();

        List<Integer> integersList2 = Arrays.asList(1,4,5,6);
        Optional<Integer> max = integersList.stream().max(Comparator.naturalOrder());
        System.out.println(max.get()    );

    }
}
