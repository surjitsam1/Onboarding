package Java8.supplierInterface;

import java.util.function.Supplier;

public class SupplierExample1_Without_Lambda implements Supplier<String> {

    @Override
    public String get() {
        return "Ello Gov'nor! without Lambda";
    }

    public static void main(String[] args) {
        Supplier<String> supplier = new SupplierExample1_Without_Lambda();
        System.out.println(supplier.get());
    }
}
