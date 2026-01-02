package t1.education.lesson1.graphMatrix;

import java.util.Arrays;

/**
 * Представление графа в виде массива
 */
public class Graph {

    private double[][] capacity;
    private double[][] loss;

    private int[][] matrix;

    /**
     * Конструктор
     *
     * @param n кол-во вершин графа
     */
    public Graph(int n) {

        capacity = new double[n][n];
        loss = new double[n][n];
        matrix = new int[n][n];

    }

    public void addEdge(int v, int w, double capacity, double loss) {

        this.capacity[v][w] = capacity;
        this.loss[v][w] = loss;

        matrix[v][w] = 1;
        matrix[w][v] = 1;

    }


    public double[][] getCapacity() {
        return capacity;
    }

    public double[][] getLoss() {
        return loss;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < matrix.length; i++) {

            sb.append("-------------");
            sb.append("Вершина ").append(i);
            sb.append("Соседние вершины ");

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    sb.append("Вершина: ").append(j).append(",capacity: ").append(capacity[i][j]).append(",loss: ").append(loss[i][j]).append("\n");
                }
            }


        }

        return sb.toString();
    }
}
