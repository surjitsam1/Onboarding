package OOPS.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("Samsung", 6, 700));
        phoneList.add(new Phone("Apple", 4, 1200));
        phoneList.add(new Phone("Motorola", 6, 300));

        Collections.sort(phoneList);
        for(Phone p: phoneList)
            System.out.println(p);
    }
}
