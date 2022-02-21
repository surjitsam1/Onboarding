package coreJava.deque;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>() ;
        ad1.add(1);
        ad1.add(2);
        ad1.add(20);
        ad1.addLast(7);
        ad1.addFirst(123);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());


    }
}
