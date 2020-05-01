import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    /* 
    
    class Node 
        int data;
        Node left;
        Node right;
    */
    static class TreeNode{
        Node node;
        int level;
        TreeNode(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }

    public static void topView(Node root) {
      if(root == null) return;
      
      TreeMap<Integer, Integer> levelMap = new TreeMap<Integer, Integer>();
      Queue<TreeNode> q = new LinkedList<TreeNode>();

      q.offer(new TreeNode(root, 0));

      while(!q.isEmpty()) {
          int size = q.size();
          for(int i = 0; i < size; i++) {
              TreeNode node = q.poll();
              if(node == null || node.node == null) continue;
              if(!levelMap.containsKey(node.level)) levelMap.put(node.level, node.node.data);

              q.offer(new TreeNode(node.node.left, node.level - 1));
              q.offer(new TreeNode(node.node.right, node.level + 1));
          }
      }

      for(int d : levelMap.values()) {
          System.out.print(d + " ");
      }

    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }   
}