package project;

import com.google.common.graph.MutableValueGraph;

import java.util.*;
/*
 * Dijkstra algorithm 
 */
public class DijkstraAlg {
    private final MutableValueGraph<String, Integer> graph;

    /*
     * Constructor for the Dijkstra algorithm 
     * @param graph Graph created from the file
     */
    DijkstraAlg(MutableValueGraph<String, Integer> graph) {
        this.graph = graph;
    }

    /*
     * Dijkstra algorithm to find the shortest path from a source node to every other node
     * @param source Node that we use to measure from 
     */
    DijkstraResult runDijkstra(String source) {
        HashMap<String, Integer> distances = new HashMap<>();
        HashSet<String> visitedNodes = new HashSet<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(distances::get));

        for (String node : graph.nodes()) {
            distances.put(node, Integer.MAX_VALUE);
        }
       
        distances.put(source, 0);
        priorityQueue.add(source);

        
        while (!priorityQueue.isEmpty()) {
            
            String current = priorityQueue.poll();
            
            if (visitedNodes.contains(current)) {
                continue;
            }
            
            visitedNodes.add(current);

         
            for (String neighbor : graph.successors(current)) {
              
                Optional<Integer> edgeWeight = graph.edgeValue(current, neighbor);
                int value = edgeWeight.get(); 
                int newDistance = distances.get(current) + value;
                


                if (newDistance < distances.get(neighbor)) {
                    distances.put(neighbor, newDistance);
                    priorityQueue.add(neighbor);
                   
                }
            }
        }

        return new DijkstraResult(distances, visitedNodes);
    }
}


   
