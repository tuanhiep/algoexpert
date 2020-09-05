import java.util.ArrayList;
import java.util.List;

public class Problem6_DeptFirstSearch {
    // Do not edit the class below except
    // for the depthFirstSearch method.
    // Feel free to add new properties
    // and methods to the class.
    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> depthFirstSearch(List<String> array) {
            // O(v+e) time, O(v) space where v is number of vertices and e
            // is number of edges in the graph
            array.add(this.name);
            traverse(this.children,array);

            return array;
        }
        public void traverse(List<Node> children, List<String> array){

            for(Node n: children){
                array.add(n.name);
                traverse(n.children, array);
            }
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
