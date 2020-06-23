package graph;
import java.io.*;
import java.util.*;
public class Graph {
public int vertices; // No. of vertices 
//Array  of lists for Adjacency List Representation 
public LinkedList<Integer> adj[]; 

// Constructor 
Graph(int v) 
{ 
    vertices = v; 
    adj = new LinkedList[v]; 
    for (int i=0; i<v; ++i) 
        adj[i] = new LinkedList(); 
} 

//Function to add an edge into the graph 
void addEdge(int v, int w) 
{ 
    adj[v].add(w);  // Add w to v's list. 
} 
}
