package src;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

//
public class Problem2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            pq.add(sc.nextInt());
            if (i<2){
                System.out.println(-1);
            }
            else{
                int first=pq.poll();
                int second= pq.poll();
                int third= pq.poll();
                int res=first*second*third;
                System.out.println(res);
                pq.offer(first);
                pq.offer(second);
                pq.offer(third);
            }

        }



//give inputs numbers with spaces

    }
}
