package project;

import java.util.HashMap;
import java.util.HashSet;



/*
 * Class to store the result of the Dijkstra algorithm 
 */

public class DijkstraResult {
    private final HashMap<String, Integer> distances;
    private final HashSet<String> visitedNodes;

/*
 * Constructor for the result of the algorithm 
 * @param distances  stores the distances (cost) between 
 * @param visitedNodes stores the visited nodes 
 */
    DijkstraResult(HashMap<String, Integer> distances, HashSet<String> visitedNodes) {
        this.distances = distances;
        this.visitedNodes = visitedNodes;
    }
/*
 * Getters for distances hashmap
 */
    HashMap<String, Integer> getDistances() {
        return distances;
    }
/*
 * Getters for the visited nodes
 */

    HashSet<String> getVisitedNodes() {
        return visitedNodes;
    }
}
