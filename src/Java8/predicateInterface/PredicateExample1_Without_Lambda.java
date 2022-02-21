package Java8.predicateInterface;

import java.util.function.Predicate;

public class PredicateExample1_Without_Lambda implements Predicate<Integer> {

    @Override
    public boolean test(Integer i) {
        if(i%2==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = new PredicateExample1_Without_Lambda();
        System.out.println(predicate.test(5));
    }
}
