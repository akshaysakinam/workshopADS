package src;

import com.sun.jdi.IntegerType;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(4);
        q.offer(2);
        q.offer(15);
        q.add(22);
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

//        q.remove(1);
//        q.poll();
        System.out.println(q);

    }
}
