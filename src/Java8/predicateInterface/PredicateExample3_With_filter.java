package Java8.predicateInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample3_With_filter {

    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(1,2,3,4,5);
        list.stream().filter(t -> t%2==0).forEach(t -> System.out.println(t+" is an even number"));
    }
}
