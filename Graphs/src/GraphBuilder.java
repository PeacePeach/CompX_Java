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
		masterList.remove(junk);
	}
	
	
	// Returns the node object with a given name from the graph network if it exists.
	Node getNode(String name) {
		
		// Loop through the masterList to find the node
		for(Node iter: masterList) {
			if(iter.name.equals(name)) return iter;
		}
		
		// Return null if object with given name does not exist
		return null;
	}
	
	
	// Connect two nodes with given names together if they exist
	void addEdge (String node1, String node2) {
		Node a = getNode(node1);
		Node b = getNode(node2);
		
		if(a != null && b != null) {
			if(!hasEdge(node1, node2)) {
				addNode(node1 + "-" + node2);
			}
		}
	}
	
	// Returns true if edge exist and false if otherwise
	boolean hasEdge(String node1, String node2) {
		// Check for node1-node2 and node2-node1. Consider both the same
		String name1 = node1 + "-" + node2;
		String name2 = node2 + "-" + node1;
		Node check1 = getNode(name1);
		Node check2 = getNode(name2);
		
		// Return true if neither exist
		if(check1 == null && check2 == null) return false;
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


public class GraphBuilder {
    public static void main(String[] args){
        // Create a Graph
    	Graph test = new Graph();
    	
    	// Random test cases
    	test.addNode("n1");
    	test.addNode("n2");
    	test.removeNode("n3");
    	test.addEdge("n1", "n2");
    	test.addEdge("n1", "n3");
    	test.hasEdge("n1", "n2");
    	test.addNode("n3");
    	test.addEdge("n3", "n1");
    	test.addEdge("n1", "n3");
    	test.addEdge("n2", "n3");
    	test.removeEdge("n4", "n3");
    	test.printStructure();
    	
    }
}
