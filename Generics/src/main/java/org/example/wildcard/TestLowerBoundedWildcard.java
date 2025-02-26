package org.example.wildcard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLowerBoundedWildcard {
    public static void main(String[] args) {
        List<? super Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(5);
//        nums.add(1.5);


        List<? super Integer> numsItems= new ArrayList<Number>();
        //allowed as Number is the upper class of Integer



        List<? super Integer> numsObject = new ArrayList<Object>();
        //allowed as Integer is an Object

        List<Serializable> list = new ArrayList<>();
        list.add("Hello"); // String implement serializable
        list.add(1);// Number implement serializable

//        read Items from a lower bounded wildcard
        showAll(list); // works as Serializable is a super class of Number


        //Insert items is working
        List<? super Number> numsList= new ArrayList<>();
        numsList.add(1);
        numsList.add(1.5);
        numsList.add(2.5f);
        showAll(numsList);

    }

    private static void showAll(List<? super Number> numbers) {
//        upperBounded only to read the items
        for (Object num : numbers) {
            System.out.println(num);
        }
//        try to insert an item will not work
//        compiler don't know if it is Double or Float or int - no guarantee on the type
//        numbers.add(1);
    }

    private static Double sumAllDouble (List<? extends Number> numbers){
        double sum=0;
        for (Number num: numbers
             ) {
            sum+=num.doubleValue();
        }
        System.out.println("the sum ist: "+sum);
        return sum;
    }
}
