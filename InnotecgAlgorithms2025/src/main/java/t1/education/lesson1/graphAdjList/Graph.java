package t1.education.lesson1.graphAdjList;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализация графа через список смежностей
 */

public class Graph {

    private List<Edge>[] graph;

    /**
     * Конструктор
     *
     * @param n кол-во вершин графа
     */
    public Graph(int n) {

        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

    }

    public void addEdge(int v, int w, double capacity, double loss) {

        graph[v].add(new Edge(v, w, capacity, loss));
        graph[w].add(new Edge(w, v, capacity, loss));

    }


    static class Edge {

        private int from;
        private int to;

        private double capacity;
        private double loss;

        public Edge(int from, int to, double capacity, double loss) {
            this.from = from;
            this.to = to;
            this.capacity = capacity;
            this.loss = loss;

        }

        public int getFrom() {
            return from;
        }

        public double getLoss() {
            return loss;
        }


        public double getCapacity() {
            return capacity;
        }


        public int getTo() {
            return to;
        }

    }


    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < graph.length; i++) {

            sb.append("-------------");
            sb.append("Вершина ").append(i).append("\n");
            List<Edge> edges = graph[i];

            sb.append("Сколько соседних вершин: ").append(edges.size()).append("\n");
            sb.append("Список соседних вершин ").append("\n");
            for (Edge edge : edges) {
                sb.append("Вершина: ").append(edge.to).append(",capacity: ").append(edge.capacity).append(",loss: ").append(edge.loss).append("\n");
            }

            sb.append("\n");


        }

        return sb.toString();
    }
}
