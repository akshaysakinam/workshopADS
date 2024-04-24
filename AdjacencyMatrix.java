package src;

public class AdjacencyMatrix {
    private int[][] adjacentMatrix;
    private int numVertices;
    public AdjacencyMatrix(int numVertices){
        this.numVertices=numVertices;
        this.adjacentMatrix=new int[numVertices][numVertices];
    }
    public void addEdge(int source,int destination){
        adjacentMatrix[source][destination]=1;
    }
    public boolean hasEdge(int source,int destination){
        return adjacentMatrix[source][destination]==1;
    }
    void printGraph(){
        System.out.println("Adjancency Matrix representation of graph is:");
        for (int i=0;i<numVertices;i++){
            for (int j=0;j<numVertices;j++){
                System.out.println(i+" "+j);
            }
        }
    }

    public static void main(String[] args) {
        AdjacencyMatrix graph=new AdjacencyMatrix(5);
        graph.addEdge(0,1);
        graph.addEdge(1,0);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(2,1);


    }
}
