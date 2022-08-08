package com.java.datastructure.stack;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStack<T> implements Stack<T> {

    private static final int CAPACITY = 10;

    private Object[] elements;
    private int size;

    public ArrayStack() {
        elements = new Object[CAPACITY];
        size = 0;
    }

    @Override
    public void push(T value) {
        if (size < CAPACITY) {
            elements[size++] = value;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public T pop() {
        T e = (T) elements[size - 1];
        elements[size - 1] = null;
        size--;
        return e;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        return (T) elements[size - 1];
    }

    @SuppressWarnings("unchecked")
    @Override
    public Stream<T> getStream() {
        return (Stream<T>) Stream.of(Arrays.copyOfRange(elements, 0, size));
    }
}
