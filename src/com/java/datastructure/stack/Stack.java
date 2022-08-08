package com.java.datastructure.stack;

import java.util.stream.Stream;

public interface Stack<T> {

    void push(T value);

    T pop();

    T peek();

    Stream<T> getStream();

}
