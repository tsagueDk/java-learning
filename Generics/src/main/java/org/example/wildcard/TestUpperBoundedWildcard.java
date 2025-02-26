package org.example.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestUpperBoundedWildcard {
    public static void main(String[] args) {
        List<? extends Number> nums = new ArrayList<Integer>();
        List<? extends Number> numsDouble = new ArrayList<Double>();
        List<? extends Number> numsFloat = new ArrayList<Float>();
//       List<? extends Number> strings = new ArrayList<String>(); will not work
//       nums.get(0); // we can read it
//       nums.add(0);  we can't insert on  it
        nums= Arrays.asList(1,2,3,4);
        numsDouble= Arrays.asList(1.5,2.9,3,4.5);
        showAll(nums);

        sumAllDouble(numsDouble);
    }

    private static void showAll(List<? extends Number> numbers) {
//        upperBounded only to read the items
        for (Number num : numbers) {
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
