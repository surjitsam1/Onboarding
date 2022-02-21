package Java8.supplierInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample2_With_Lambda {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Ello Gov'nor! with Lambda";

        System.out.println(supplier.get());

        List<String> list =new ArrayList<>();

        System.out.println(list.stream().findAny().orElseGet(() -> "Ello Gov'nor in Stream"));
    }
}
