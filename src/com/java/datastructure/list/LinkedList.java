package com.java.datastructure.list;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class LinkedList<T> implements List<T> {

    private int size;
    private Node<T> first;
    private Node<T> last;

    public LinkedList() {
        size = 0;
    }

    @Override
    public void add(T value) {
        Node<T> n = new Node<>(value);
        if (first == null) {
            first = n;
        } else {
            last.setNext(n);
        }
        last = n;
        size++;
    }

    @Override
    public Optional<T> get(T value) {
        Node<T> current = first;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return Optional.of(value);
            }
            current = current.getNext();
        }
        return Optional.empty();
    }

    @Override
    public boolean remove(T value) {
        if (size == 0) {
            return false;
        } else if (first.getValue().equals(value)) {
            first = first.getNext();
            size--;
            return true;
        }

        Node<T> previous = first;
        Node<T> current = first;

        while (current != null) {
            if (current.getValue().equals(value)) {
                previous.setNext(current.getNext());
                size--;
                return true;
            }
            previous = current;
            current = current.getNext();
        }
        return false;
    }

    @Override
    public int getSize() {
        return size;
    }

    public Stream<T> stream() {
        ArrayList<T> all = new ArrayList<>(size);
        Node<T> current = first;
        while (current != null) {
            all.add(current.getValue());
            current = current.getNext();
        }
        return all.stream();
    }

}
