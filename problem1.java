package src;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

//ReverseQueueUsingStack
public class problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range:");
        int n=sc.nextInt();
        Queue<Integer> q=new LinkedList<>();

        for(int i=1;i<=n;i++){
            q.add(sc.nextInt());
        }

        System.out.println("Input Q:"+q);

        Stack<Integer> s=new Stack<>();
        for(int i=1;i<=n;i++){
            s.push(q.poll());
        }
        Queue<Integer> rq=new LinkedList<>();
        for (int i=1;i<=n;i++){
            rq.add(s.pop());
        }
        System.out.println("Reversed Elements:"+rq);



    }
}
