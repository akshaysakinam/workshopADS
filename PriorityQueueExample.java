package src;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample
{
    public static void main(String[] args) {
        PriorityQueue <Object> q=new PriorityQueue<Object>(Collections.reverseOrder());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        q.poll();
        System.out.println(q);

    }
}
