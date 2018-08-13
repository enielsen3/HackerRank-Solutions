class Solution {
	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
    

	public static int height(Node root) {
        if(root == null){
            return 0;
        }
        //since the challenge wants max edges not height
        else if (root.left == null && root.right == null){
            return 0;
        }
        else{
            int leftdepth = height(root.left);
            int rightdepth = height(root.right);
            
            return leftdepth > rightdepth ? (leftdepth + 1) : (rightdepth + 1);
        }
    }
