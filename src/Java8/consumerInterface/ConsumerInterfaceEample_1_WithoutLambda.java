package Java8.consumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceEample_1_WithoutLambda {
    public static void main(String[] args) {
        List<Integer> numbers =Arrays.asList(1,2,3,4,5);
        Consumer consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer i){
                System.out.println(i);
            }
        };
        numbers.forEach(consumer);
    }
}
