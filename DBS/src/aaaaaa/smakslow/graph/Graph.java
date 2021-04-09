package com.smakslow.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph {
    private static final int INF = Integer.MAX_VALUE;

    static int n;
    int[][] graph = new int[n][n];
    boolean visited[] = new boolean[n];

    void DFS(int u, int depth) {
        visited[u] = true;
        for (int v = 0; v < n; v++) {
            if (!visited[v] && graph[u][v] != INF) {
                DFS(v, depth + 1);
            }
        }
    }

    void DFSTrace(){
        for (int u = 0; u < n; u++) {
            if(!visited[u]){
                DFS(u,1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
    }
}
