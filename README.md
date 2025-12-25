# Dijkstra Algorithm Implementation 
This project implements Dijkstra’s shortest path algorithm on a weighted, undirected graph constructed from a real-world road network dataset.
The program reads a graph from an input file, allows the user to select a source node, and computes shortest paths to all reachable nodes.
## Features 
- Graph construction from an edge list file

- Randomized non-negative edge weight assignment

- Implementation of Dijkstra’s shortest path algorithm

- Identification of reachable vs. unreachable nodes

- Tracking of visited nodes during algorithm execution

- Optional graphical visualization of the graph

## Dataset 
This project is based on the roadNet-PA dataset, which represents the Pennsylvania road network as a graph.

-   Original dataset size: ~1 million nodes, ~3 million edges

-   Source: SNAP (Stanford Network Analysis Project)

-   Dataset URL: https://snap.stanford.edu/data/roadNet-PA.html

## Demo 
Input:

```Enter the source node: 5```


Output (excerpt):

```Shortest Paths from Source Node 5:

To Node 6: 8 units
To Node 7: 17 units
To Node 309: 26 units
To Node 3998: 36 units
To Node 6309: Can't reach


Visited Nodes:

[16, 273, 274, 2, 3, 388, 4, 1060215, 389, 5, 6, 7, ...]

