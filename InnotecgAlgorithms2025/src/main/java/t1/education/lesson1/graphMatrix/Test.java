package t1.education.lesson1.graphMatrix;


public class Test {

    static final int A = 0, B = 1, C = 2, D = 3, E = 4, F = 5;

    public static void main(String[] args) {

        Graph graph = new Graph(6);

        graph.addEdge(A, B, 1500, 90);
        graph.addEdge(A, C, 2000, 10);
        graph.addEdge(A, D, 1000, 50);

        graph.addEdge(B, F, 1500, 60);
        graph.addEdge(C, F, 500, 20);
        graph.addEdge(C, E, 900, 5);
        graph.addEdge(D, E, 2500, 1);
        graph.addEdge(E, F, 300, 85);

        System.out.println(graph);
    }


}
