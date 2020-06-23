package graph;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Graph g = new Graph(4); 
		  BFS b=new BFS();
		  b.g= new Graph(4);
        b.g.addEdge(0, 1); 
        b.g.addEdge(0, 2); 
        b.g.addEdge(1, 2); 
        b.g.addEdge(2, 0); 
        b.g.addEdge(2, 3); 
        b.g.addEdge(3, 3);
        System.out.println("Following is Breadth First Traversal "+ 
				"(starting from vertex 2)"); 
b.BFS(2); 
DFS d =new DFS();
d.g=b.g;
System.out.println("\nFollowing is Depth First Traversal "+ 
        "(starting from vertex 2)"); 

d.DFS(2);
	}

}
