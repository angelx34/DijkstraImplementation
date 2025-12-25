package project;

import java.util.HashMap;
import java.util.HashSet;

/*
 * Class that produces a readable version of the results of the algorithm 
 */
public class DijkstraDisplay {
    /*
     * Shows the results of the algorithm 
     * @param source source node 
     * @param distances the cost of traveling to each nodes 
     */
    public void displayShortestPaths(String source, HashMap<String, Integer> distances) {
        System.out.println("Shortest Paths from Source Node " + source + ":");
        for (HashMap.Entry<String, Integer> entry : distances.entrySet()) {
            if (entry.getValue() == Integer.MAX_VALUE) {
                System.out.println("To Node " + entry.getKey() + ": Can't reach");
            } else {
                System.out.println("To Node " + entry.getKey() + ": " + entry.getValue() + " miles");
            }

        }
    }

    /*
     * Shows the nodes travelled overall while the algorithm ran 
     * @param visitedNodes  
     */
    public void displayVisitedNodes(HashSet<String> visitedNodes) {
        System.out.println("Visited Nodes during Dijkstra's Algorithm:");
        System.out.println(visitedNodes);
    }
}
