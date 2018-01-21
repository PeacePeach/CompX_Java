import java.util.ArrayList;

class Graph {
	
	ArrayList<Node> masterList = new ArrayList<Node>();
	
    // Add a node to the graph network.
	void addNode(String name) {
		Node myNode = new Node(name);
		masterList.add(myNode);
	}
	
	
	// Remove the node with a given name from the the graph network if it exists.
	void removeNode (String name) {
		Node junk = getNode(name);
		System.out.println("...Removing: " + name + "...");
		if(junk != null) System.out.println("--->Successfully removing: " + name);
		masterList.remove(junk);
	}
	
	
	// Returns the node object with a given name from the graph network if it exists.
	Node getNode(String name) {
		
		// Loop through the masterList to find the node
		for(Node iter: masterList) {
			if(iter.name == name) return iter;
		}
		
		// Return null if object with given name does not exist
		return null;
	}
	
	
	// Connect two nodes with given names together if they exist
	void addEdge (String node1, String node2) {
		Node a = getNode(node1);
		Node b = getNode(node2);
		
		if(!hasEdge(node1, node2)) {
			if(a != null && b != null) {
			Node ab = new Node(node1 + "-"+ node2);
			masterList.add(ab);
			}
		}
	}
	
	// Returns true if edge exist and false if otherwise
	boolean hasEdge(String node1, String node2) {
		String name = node1 + "-" + node2;
		Node check = getNode(name);
		if(check == null) return false;
		return true;
	}
		
	// Remove the edge between the given nodes if exists 
	void removeEdge(String node1, String node2) {
		removeNode(node1 + "-" + node2);
	}
	
	// Display all of the nodes and all of the edges between nodes 
	void printStructure() {
		for(int i = 0; i < masterList.size(); i++)
		System.out.println(masterList.get(i).name);
	}
}
 
class Node {
	
	public String name; 
	
	public Node(String name) {
		this.name = name;
	}
	
}

// Any additional classes here

class Edge {
	String connect;
		
	public Edge(String nodeA, String nodeB) {
		this.connect = nodeA + nodeB;
	}
}

public class GraphBuilder {
    public static void main(String[] args){
        // Your code here
    	Graph test = new Graph();
    	test.addNode("n1");
    	test.addNode("n2");
    	test.removeNode("n1");
    	test.addEdge("n1", "n2");
    	test.addEdge("n1", "n3");
    	test.hasEdge("n1", "n2");
    	test.addNode("n3");
    	test.addEdge("n1", "n3");
    	test.addEdge("n2", "n3");
    	test.addEdge("n2", "n3");
    	test.removeEdge("n2", "n3");
    	test.printStructure();
    	
    }
}
