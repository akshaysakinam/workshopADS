package src;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Problem5
{
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<Integer,Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            int key=arr[i];
            if(!hm.containsKey(key)){
                hm.put(key,1);
            }
            else{
                int value=hm.get(key);
                hm.put(key,value+1);
            }
        }
        System.out.println(hm);
        for (int i=0; i<n;i++){
            if (hm.get(arr[i]) == 1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
