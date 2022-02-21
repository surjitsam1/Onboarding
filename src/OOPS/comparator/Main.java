package OOPS.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("Samsung", 4, 500));
        phoneList.add(new Phone("Apple", 2, 1200));
        phoneList.add(new Phone("Motorola", 6, 300));

        Comparator<Phone> comparator = new Comparator<Phone>(){
            public int compare(Phone p1, Phone p2){
                if(p1.getRam() > p2.getRam())
                    return 1;
                else
                    return -1;
            }
        };

        Collections.sort(phoneList, comparator);

        for(Phone p: phoneList)
            System.out.println(p);
    }
}
