package src;

import java.util.ArrayList;
import java.util.Objects;

public class HeterogeneousArrayList
{
    public static void main(String[] args) {
        ArrayList<Object> l1=new ArrayList<>();
        l1.add("Apple");
        l1.add("Banana");
        l1.add("Orange");
        l1.add(78);
        l1.add('d');
        System.out.println(l1);
        for (Object d:l1){
            System.out.println(d);
        }
        l1.add(0,"L");
        l1.add(1,"K");
        System.out.println(l1);
        l1.set(2,"Guava");
        System.out.println(l1);
        System.out.println(l1.get(3));
        System.out.println(l1.remove(1));
        System.out.println(l1);

    }
}
