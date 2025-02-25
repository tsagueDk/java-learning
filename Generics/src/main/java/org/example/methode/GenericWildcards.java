package org.example.methode;

import java.util.Arrays;
import java.util.List;

public class GenericWildcards {

//    private static <T> void printItems(List<T> objects){
    private static  void printItems(List<?> objects){
        for (Object o: objects
             ) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        printItems(numbers);
    }
}
