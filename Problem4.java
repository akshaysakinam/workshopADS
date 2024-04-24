package src;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Target:");
        int target=sc.nextInt();
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                }

            }
        }
        System.out.println(-1);
    }
}
