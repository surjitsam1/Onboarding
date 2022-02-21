package Java8.consumerInterface;

import java.util.Arrays;
import java.util.List;

public class ConsumerInterfaceExample_2_WithLambda {

    public static void main(String[] args) {
        List<Integer> numbers =Arrays.asList(1,2,3,4,5,6);

//        Consumer consumer = (i) -> System.out.println(i);
//        numbers.forEach(consumer);

        // without using stream API
        numbers.forEach(i -> System.out.println(i));

        // using stream API
        numbers.stream().forEach(i -> System.out.println(i));

    }
}
