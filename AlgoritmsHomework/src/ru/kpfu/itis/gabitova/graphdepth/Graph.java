package ru.kpfu.itis.gabitova.graphdepth;

public class Graph {
    private final int VERTEX_NUMBER;
    private int vertexCount;
    private Vertex [] vertexArray;
    private int [][] matrix;
    private boolean [] used;

    public Graph(int maxVertexCount) {
        this.VERTEX_NUMBER = maxVertexCount;
        used = new boolean[VERTEX_NUMBER];
        matrix = new int[VERTEX_NUMBER][VERTEX_NUMBER];
        for (int i = 0; i < VERTEX_NUMBER; i++) {
            for (int j = 0; j < VERTEX_NUMBER; j++) {
                matrix[i][j] = 0;
            }
        }
        vertexArray = new Vertex[VERTEX_NUMBER];
    }

    void addV(String v) {
        vertexArray[vertexCount++] = new Vertex(v);
    }

    void addE(int begin, int end) {
        matrix[begin][end] = 1;
        matrix[end][begin] = 1;
    }

    void dfs(int vertexNum) {
        used[vertexNum] = true;
        for (int i = 0; i < vertexCount; i++) {
            if (matrix[vertexNum][i] == 1 && !used[i]) {
                System.out.print(vertexArray[vertexNum].getV() + " -> ");
                System.out.println(vertexArray[i].getV());
                dfs(i);
            }
        }
    }
}
