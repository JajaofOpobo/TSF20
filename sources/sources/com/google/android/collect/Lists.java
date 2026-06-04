package com.google.android.collect;

import java.util.ArrayList;

public class Lists {
    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> newArrayList(E... elements) {
        ArrayList<E> list = new ArrayList<>(elements.length);
        for (E e : elements) {
            list.add(e);
        }
        return list;
    }
}
