package ru.kpfu.itis.gabitova.graphdepth;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addV("a");
        graph.addV("b");
        graph.addV("c");
        graph.addV("d");
        graph.addE(0,1);
        graph.addE(1,2);
        graph.addE(2,3);
        graph.addE(3,0);
        graph.dfs(0);
    }
}
