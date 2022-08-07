package com.java.datastructure.list;

import java.util.Optional;
import java.util.stream.Stream;

public interface List<T> {

    void add(T value);

    Optional<T> get(T value);

    boolean remove(T value);

    int getSize();

    Stream<T> getStream();

}
