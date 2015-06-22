package MinMaxHeap;

public class MinMaxHeap {

  public static class Node {

    public int value;
    public Node left;
    public Node right;
    
    public Node(int value){
    	this.value = value;
    	left = null;
    	right = null;
    }
    
  }

  // Checks if a binary tree is a min/max heap.
  private static boolean isMinMax(Node root,boolean level) {
	  if(root != null && (root.left != null && root.right != null)){
		  if(level){
			  if(!(root.left.value > root.value && isMinMax(root.left,!level))){
					return false;
				}
			  if(!(root.right.value > root.value && isMinMax(root.right,!level))){
					return false;
			  }
		  }
		  else{
			  if(!(root.left.value < root.value && isMinMax(root.left,!level))){
					return false;
				}
			  if(!(root.right.value < root.value && isMinMax(root.right,!level))){
					return false;
				}
		  }
	  }
	  return true;
  }
  
  public static boolean isMinMax(Node root){
	  
	  if(isMinMax(root,false)){
		  return true;
	  }
	  else return false;
  }
  
  public static void main(String[] args) {
	
	  Node start = new Node(5);
	  start.left = new Node(1);
	  start.right = new Node(1);
	  start.left.left = new Node(11);
	  start.left.right = new Node(11);
	  start.right.left = new Node(12);
	  start.right.right = new Node(12);
	  System.out.println(isMinMax(start));
	  
  }
}

