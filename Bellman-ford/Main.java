import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BellmanFord {

    // Inner class to represent a weighted edge in the graph
    static class Edge {
        int source, destination, weight;

        Edge(int source, int destination, int weight) {
            this.source = source; // 0-based index
            this.destination = destination; // 0-based index
            this.weight = weight;
        }

        @Override
        public String toString() {
            return String.format("(v%d, v%d, %d)", source + 1, destination + 1, weight);
        }
    }

    // Function to run the Bellman-Ford algorithm
    public static void runBellmanFord(int numVertices, List<Edge> edges, int sourceVertexIndex) {
        int[] distances = new int[numVertices];
        int[] predecessors = new int[numVertices];

        // Step 1: Initialize distances from source to all other vertices as INFINITE
        Arrays.fill(distances, Integer.MAX_VALUE);
        Arrays.fill(predecessors, -1); // -1 indicates no predecessor
        distances[sourceVertexIndex] = 0;

        System.out.println("Bellman-Ford Algorithm Execution:");
        System.out.println("Graph: " + numVertices + " vertices, " + (edges.size() / 2) + " undirected edges.");
        System.out.println("Source Vertex: v" + (sourceVertexIndex + 1));
        System.out.println("\n**Initialization:**");
        System.out.println("Set distance to source vertex v" + (sourceVertexIndex + 1) + " to 0, all others to infinity.");
        printDistances(distances, "Initial distances");
        System.out.println("\n--- Iterations Start ---");

        // Step 2: Relax all edges |V| - 1 times.
        for (int i = 1; i < numVertices; ++i) {
            System.out.println("\n**Iteration " + i + ":**");
            boolean updated = false;
            int[] distancesBeforeIter = Arrays.copyOf(distances, numVertices);

            for (Edge edge : edges) {
                int u = edge.source;
                int v = edge.destination;
                int weight = edge.weight;
                System.out.println("  Checking edge " + edge + ":");

                // If distance to source is not infinity and path through u is shorter
                if (distances[u] != Integer.MAX_VALUE && distances[u] + weight < distances[v]) {
                    System.out.printf("    * Relaxation possible: distance[v%d] (%s) + weight (%d) = %d < distance[v%d] (%s)\n",
                            u + 1, distToString(distances[u]), weight, distances[u] + weight, v + 1, distToString(distances[v]));
                    distances[v] = distances[u] + weight;
                    predecessors[v] = u;
                    updated = true;
                    System.out.printf("    * Updated distance[v%d] = %d, predecessor[v%d] = v%d\n",
                            v + 1, distances[v], v + 1, u + 1);
                } else if (distances[u] == Integer.MAX_VALUE) {
                     System.out.printf("    - Cannot relax: source vertex v%d is currently unreachable (distance = infinity).\n", u + 1);
                } else {
                     System.out.printf("    - No relaxation: distance[v%d] (%s) + weight (%d) = %d >= distance[v%d] (%s)\n",
                            u + 1, distToString(distances[u]), weight, distances[u] + weight, v + 1, distToString(distances[v]));
                }
            }
            printDistances(distances, "Distances after iteration " + i);
            if (!updated) {
                 System.out.println("No distances updated in iteration " + i + ". Algorithm can terminate early.");
                 break; // Optimization
            }
        }
        System.out.println("\n--- Iterations End ---");

        // Step 3: Check for negative-weight cycles.
        System.out.println("\n**Checking for negative weight cycles:**");
        boolean negativeCycleDetected = false;
        for (Edge edge : edges) {
            int u = edge.source;
            int v = edge.destination;
            int weight = edge.weight;
            if (distances[u] != Integer.MAX_VALUE && distances[u] + weight < distances[v]) {
                System.out.println("  Negative cycle detected involving edge " + edge + "!");
                 System.out.printf("  Condition met: distance[v%d] (%s) + weight (%d) = %d < distance[v%d] (%s)\n",
                            u + 1, distToString(distances[u]), weight, distances[u] + weight, v + 1, distToString(distances[v]));
                negativeCycleDetected = true;
                break;
            }
        }
         if (!negativeCycleDetected) {
            System.out.println("  No negative weight cycles detected.");
        }

        // Print the final shortest distances and predecessors
        System.out.println("\n## Final Results:");
        System.out.println("| Vertex | Shortest Distance | Predecessor |");
        System.out.println("|--------|-------------------|-------------|");
        for (int i = 0; i < numVertices; ++i) {
            String distStr = distToString(distances[i]);
            String predStr = (predecessors[i] == -1) ? "None" : "v" + (predecessors[i] + 1);
            System.out.printf("| v%-6d | %-17s | %-11s |\n", i + 1, distStr, predStr);
        }
    }

    // Helper to print distances array
    private static void printDistances(int[] distances, String label) {
        System.out.print("    **" + label + ":** { ");
        for (int i = 0; i < distances.length; i++) {
            System.out.print("v" + (i + 1) + ": " + distToString(distances[i]));
            if (i < distances.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" }");
    }
    
    // Helper to convert distance to string (handles infinity)
    private static String distToString(int distance) {
        return (distance == Integer.MAX_VALUE) ? "Infinity" : String.valueOf(distance);
    }

    public static void main(String[] args) {
        int numVertices = 11;
        int sourceVertexIndex = 0; // v1 is index 0

        List<Edge> edges = new ArrayList<>();
        // Add edges (undirected graph, add both directions)
        // v1=0, v2=1, v3=2, v4=3, v5=4, v6=5, v7=6, v8=7, v9=8, v10=9, v11=10
        edges.add(new Edge(0, 1, 2)); edges.add(new Edge(1, 0, 2)); // v1-v2
        edges.add(new Edge(0, 2, 8)); edges.add(new Edge(2, 0, 8)); // v1-v3
        edges.add(new Edge(0, 3, 1)); edges.add(new Edge(3, 0, 1)); // v1-v4
        edges.add(new Edge(1, 2, 6)); edges.add(new Edge(2, 1, 6)); // v2-v3
        edges.add(new Edge(1, 4, 1)); edges.add(new Edge(4, 1, 1)); // v2-v5
        edges.add(new Edge(2, 3, 7)); edges.add(new Edge(3, 2, 7)); // v3-v4
        edges.add(new Edge(2, 4, 5)); edges.add(new Edge(4, 2, 5)); // v3-v5
        edges.add(new Edge(2, 5, 1)); edges.add(new Edge(5, 2, 1)); // v3-v6
        edges.add(new Edge(2, 6, 2)); edges.add(new Edge(6, 2, 2)); // v3-v7
        edges.add(new Edge(3, 6, 9)); edges.add(new Edge(6, 3, 9)); // v4-v7
        edges.add(new Edge(4, 5, 3)); edges.add(new Edge(5, 4, 3)); // v5-v6
        edges.add(new Edge(4, 7, 2)); edges.add(new Edge(7, 4, 2)); // v5-v8
        edges.add(new Edge(5, 6, 4)); edges.add(new Edge(6, 5, 4)); // v6-v7
        edges.add(new Edge(5, 8, 6)); edges.add(new Edge(8, 5, 6)); // v6-v9
        edges.add(new Edge(6, 8, 3)); edges.add(new Edge(8, 6, 3)); // v7-v9
        edges.add(new Edge(6, 9, 1)); edges.add(new Edge(9, 6, 1)); // v7-v10
        edges.add(new Edge(7, 8, 7)); edges.add(new Edge(8, 7, 7)); // v8-v9
        edges.add(new Edge(7, 10, 9)); edges.add(new Edge(10, 7, 9)); // v8-v11
        edges.add(new Edge(8, 9, 1)); edges.add(new Edge(9, 8, 1)); // v9-v10
        edges.add(new Edge(8, 10, 2)); edges.add(new Edge(10, 8, 2)); // v9-v11
        edges.add(new Edge(9, 10, 4)); edges.add(new Edge(10, 9, 4)); // v10-v11

        runBellmanFord(numVertices, edges, sourceVertexIndex);
    }
}
