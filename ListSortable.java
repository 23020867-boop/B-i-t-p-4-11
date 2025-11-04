package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListSortable<E extends Comparable<? super E>>{
    private List<E> list = new ArrayList<>();

    public void add(E element) {
        list.add(element);
    }
    public void sort() {
        list.sort(null);
    }
    public void print() {
        for (E element : list) {
            System.out.println(element);
        }
    }
}
