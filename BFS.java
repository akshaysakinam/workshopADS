package src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    private int v;
    private List<List<Integer>> adjList;
    public BFS(int v){
        this.v=v;
        this.adjList=new ArrayList<>(v);
        for(int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }
    }
    public void addEdge(int u,int v){
        adjList.get(u).add(v);
    }
    public void bfs(int source){
        boolean[] visited=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        visited[source]=true;
        q.offer(source);
        while(!q.isEmpty()){
            int vertex=q.poll();
            System.out.println(vertex+" ");
            for (int neighbour:adjList.get(vertex)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    q.offer(neighbour);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v=7;
        BFS g=new BFS(v);
        g.addEdge(0,1);
        g.addEdge(1,0);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,4);
        System.out.println("Breadth first search:");
        g.bfs(0);

    }
}
