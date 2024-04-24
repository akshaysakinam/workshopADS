package src;

import java.util.ArrayList;

public class Eg2
{
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println("elements:"+l1);
        for(int f:l1){
            System.out.print(f+" ");
        }
        System.out.println();
        l1.add(0,15);
        System.out.println(l1);
        l1.add(0,16);
        System.out.println(l1);
        System.out.println(l1.get(2));
        l1.set(2,20);
        System.out.println(l1);
        l1.add(2,22);
        l1.add(4,26);
        System.out.println(l1.remove(1));
        l1.add(1,30);
        l1.add(1,32);
        System.out.println(l1.get(4));
        l1.set(2,55);
        System.out.println(l1);
        System.out.println(l1.get(2));


    }
}
