package project;

import com.google.common.graph.*;
import java.util.Random;
import java.util.Scanner;


/*
   * Main which reads in a file and gets input for the source node 
   * @param args  input from the terminal 
   */

class Main {
  public static void main(String[] args){
    // Initialize graph
    MutableValueGraph<String, Integer> graph = ValueGraphBuilder.undirected().build();
    // Specify where data is stored
    String filename = "roadNet-PA.txt";
    Scanner file = ReadFile.read(filename);
    Integer lineCount = 0;
    // Read file line by line,stops at 50
    while (file.hasNextLine() && lineCount < 50) {
      String line = file.nextLine();
      // assigns random weights of range 20
      Random rand = new Random();
      int weights = rand.nextInt(20);
      System.out.println(line);
      if(lineCount > 3){
        //creates nodes 
        String[] fields = line.split("\\s+");
        graph.putEdgeValue(fields[0], fields[1],weights);
      }

      lineCount += 1;
    }
    file.close();
    System.out.println(graph);
    //Displays the graph 
    new GraphDisplay(graph);
    // user input for source
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the source node: ");
    String sourceNode = scanner.next();

    //new instance of the algorithm runner
    DijkstraAlg dijkstraRunner = new DijkstraAlg(graph);
    
    // Run the algorithm in relation to the source node 
    DijkstraResult result = dijkstraRunner.runDijkstra(sourceNode);

    // New instance of result displayer
    DijkstraDisplay resultDisplayer = new DijkstraDisplay();
    // displays the shortes paths to each node, gets the total distance calculated in the result  
    resultDisplayer.displayShortestPaths(sourceNode, result.getDistances());
    // displays the visited nodes, unsure of this because i want to get the visited nodes to get to a certain spot
    resultDisplayer.displayVisitedNodes(result.getVisitedNodes());
    scanner.close();
  }
  

}