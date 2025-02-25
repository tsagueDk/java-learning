package org.example.methode;

import java.util.ArrayList;
import java.util.List;

class Bucket<T>{
    private T item;

     public T getItem() {
         return item;
     }

     public void setItem(T item) {
         this.item = item;
     }
 }
public class GenericTypeInterference {
     private static <T> void addStore(T item, List<Bucket<T>> listItem){
         Bucket<T> newBucket = new Bucket<>();
         newBucket.setItem(item);
         listItem.add(newBucket);
         System.out.println("added new item :"+item);
     }

    public static void main(String[] args) {
         List<Bucket<String>> list = new ArrayList<>();
        addStore("Kevin", list);
        addStore("java", list);
    }
}
