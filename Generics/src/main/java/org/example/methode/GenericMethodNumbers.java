package org.example.methode;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

class  HandleNumbers  {

     public <T extends Number> double addNumbers(T num1, T num2){
         return num1.doubleValue()+num2.doubleValue();
     }
     public <T extends Number> long countGreaterNumbers(T[] items, T item){
       return   Arrays.stream(items)
         .filter(itemValue -> item.doubleValue() < itemValue.doubleValue())
                 .count();
     }
     public <T extends Comparable<T>> long countGreaterItems(T[] items, T item){
         AtomicInteger count = new AtomicInteger();
          Arrays.stream(items)
         .forEach(itemValue -> {
            if( itemValue.compareTo(item) > 0){
                count.getAndIncrement();
            }
         });
            return  count.get();
     }
 }

   class resultMain {
       public static void main(String[] args) {
           HandleNumbers number = new HandleNumbers();
           System.out.println("Returns : " + number.addNumbers(10.5, 10));
//           System.out.println("Returns : " + number.addNumbers(10, 10));
//           System.out.println("Returns : " + number.addNumbers(10.6f, 10));
           Integer[] arrayOfInt = {1, 2, 3, 4, 5};
           Double[] arrayOfDouble = {1.4, 2.1, 3.9, 4.3, 5.1};
           String[] arrayOfChar = {"a", "b", "f", "d", "e"};
           System.out.println("Returns : " + number.countGreaterItems(arrayOfInt, 3));
           System.out.println("Returns : " + number.countGreaterItems(arrayOfDouble, 2.0));
           System.out.println("Returns : " + number.countGreaterItems(arrayOfChar, "c"));
       }
   }