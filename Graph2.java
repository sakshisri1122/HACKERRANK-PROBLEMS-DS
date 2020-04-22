import java.util.LinkedList;

public class Graph2{
	
    int vertex;
    LinkedList<Integer> listArr[];

    public Graph(int vertex) {
        this.vertex = vertex;
        listArr = new LinkedList[vertex];
        for (int i = 0; i <vertex ; i++) {
            listArr[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination){

        //add edge
        listArr[source].addFirst(destination);

        //add back edge ((for undirected)
        listArr[destination].addFirst(source);
    }

    public void printGraph(){
        for (int i = 0; i <vertex ; i++) {
            if(listArr[i].size()>0) {
                System.out.print("Vertex " + i + " is connected to: ");
                for (int j = 0; j < listArr[i].size(); j++) {
                    System.out.print(listArr[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.addEdge(0,1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();

    }
}
