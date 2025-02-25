package org.example.methode;

public class GenericMethod {
    public <T> void showItem(T item){
        System.out.println("Item is of type : "+item.getClass().getSimpleName());
    }
    public <T> T returnItemObject(T item){
        System.out.println("Item is of type : "+item.getClass().getSimpleName());
        return item;
    }

    public <T> boolean checkEquality(T firstParam, T secondParam){

        if(!firstParam.getClass().getSimpleName().equals(secondParam.getClass().getSimpleName())){
            return false;
        }else return firstParam.equals(secondParam);
    }
}

   class result{
       public static void main(String[] args) {
           GenericMethod method = new GenericMethod();
//           method.returnItemObject(45);
//           method.showItem("Hello !");
           System.out.println("Returns : "+method.checkEquality("10.5","10.5"));
           System.out.println("Returns : "+method.checkEquality("10.5",10.5));}
   }