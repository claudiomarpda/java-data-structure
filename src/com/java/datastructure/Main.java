package com.java.datastructure;

import com.java.datastructure.list.LinkedList;
import com.java.datastructure.list.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        printAll(list);

        list.remove(1);
        printAll(list);

    }

    static void printAll(List<Integer> list) {
        list.getStream().forEach(System.out::print);
        System.out.println();
    }
}
