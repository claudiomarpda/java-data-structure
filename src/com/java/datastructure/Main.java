package com.java.datastructure;

import com.java.datastructure.list.LinkedList;
import com.java.datastructure.list.List;
import com.java.datastructure.stack.ArrayStack;
import com.java.datastructure.stack.Stack;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        runStack();
    }

    static void runStack() {
        Stack<Integer> s = new ArrayStack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        printAll(s.stream());
        s.pop();
        printAll(s.stream());
        s.pop();
        printAll(s.stream());
        s.pop();
        printAll(s.stream());
        s.push(4);
        printAll(s.stream());
        s.push(5);
        System.out.println(s.peek());
    }

    static void runList() {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        printAll(list.stream());

        list.remove(1);
        printAll(list.stream());
    }

    static void printAll(Stream<Integer> stream) {
        stream.forEach(System.out::print);
        System.out.println();
    }

}
