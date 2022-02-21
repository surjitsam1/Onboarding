package Java8.consumerInterface;

import java.util.function.Consumer;

public class ConsumerInterfaceExample_4 implements Consumer<Integer> {


    @Override
    public void accept(Integer i){
        System.out.println(i);
    }

}
