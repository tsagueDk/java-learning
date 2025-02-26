package org.example.wildcard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyMethod {
    public static void main(String[] args) {

        List<? extends Integer> numbers ;
        numbers = Arrays.asList(1,2,3,4,5);

        List<Serializable> items= new ArrayList<>();
        List<Integer> itemsItenger= new ArrayList<>();

        items.add("Hello");
        items.add(1.5f);

//        copy(numbers, new ArrayList<>());
        copy(numbers, items);
        copy(numbers, itemsItenger);
        copy(itemsItenger, itemsItenger);
    }

    private static <T> void copy (List<? extends T> source,List<? super T> target ){
        target.addAll(source);
        target.forEach(System.out::println);
    }
}
