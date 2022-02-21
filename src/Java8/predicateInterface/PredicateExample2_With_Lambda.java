package Java8.predicateInterface;

import java.util.function.Predicate;

public class PredicateExample2_With_Lambda{

    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i%2==0;
        System.out.println(predicate.test(9));
    }
}
