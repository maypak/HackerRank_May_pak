import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the swapNodes function below.
     */
    static class Node{
        int val;
        Node left,right;
        public Node(int val){
            this.val = val;
            left = null;
            right = null;
        }
        @Override
        public String toString(){
            return "val= " + this.val;
        }
    }

    public static Node buildtree (int[][] indexes){
        Node root = new Node(1);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        for(int i = 0;i < indexes.length; i++){
            Node temp = queue.remove();
            if(indexes[i][0] != -1){
                Node n = new Node(indexes[i][0]);
                temp.left = n;
                queue.add(n);
            }
            if(indexes[i][1] != -1){
                Node n = new Node(indexes[i][1]);
                temp.right = n;
                queue.add(n);
            }
        }
        return root;
    }
    public static void inOrder(Node root,ArrayList<Integer> all){
        if(root != null){
            inOrder(root.left,all);
            all.add(root.val);
            inOrder(root.right,all);
        }
    }
    public static void levelNode(Node root,int level,int c,ArrayList<Node> al){
        if(root != null){
        if(c % level == 0){
                al.add(root);
        }

        levelNode(root.left,level,c+1,al);
        levelNode(root.right,level,c+1,al);

        }
    }
    static int[][] swapNodes(int[][] indexes, int[] queries) {
        /*
        * Write your code here.
        */
        Node root = buildtree(indexes);
        ArrayList<Integer> all = new ArrayList<>();
        int ar[][] = new int[queries.length][indexes.length];
        for(int i = 0; i<queries.length; i++){
            ArrayList<Node> al = new ArrayList<>();
            levelNode(root,queries[i],1,al);

            for(int ii = 0;ii < al.size(); ii++)
            {
                Node tt = al.get(ii);
                Node left = tt.left;
                tt.left = tt.right;
                tt.right = left;
            }
            inOrder(root, all);
            System.out.println();
        }
        int t = 0;
        for(int i = 0; i<queries.length; i++){
            for(int j = 0;j<indexes.length; j++){
                ar[i][j] = all.get(t++);
            }
        }
        return ar;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scanner.nextLine().trim());

        int[][] indexes = new int[n][2];

        for (int indexesRowItr = 0; indexesRowItr < n; indexesRowItr++) {
            String[] indexesRowItems = scanner.nextLine().split(" ");

            for (int indexesColumnItr = 0; indexesColumnItr < 2; indexesColumnItr++) {
                int indexesItem = Integer.parseInt(indexesRowItems[indexesColumnItr].trim());
                indexes[indexesRowItr][indexesColumnItr] = indexesItem;
            }
        }

        int queriesCount = Integer.parseInt(scanner.nextLine().trim());

        int[] queries = new int[queriesCount];

        for (int queriesItr = 0; queriesItr < queriesCount; queriesItr++) {
            int queriesItem = Integer.parseInt(scanner.nextLine().trim());
            queries[queriesItr] = queriesItem;
        }

        int[][] result = swapNodes(indexes, queries);

        for (int resultRowItr = 0; resultRowItr < result.length; resultRowItr++) {
            for (int resultColumnItr = 0; resultColumnItr < result[resultRowItr].length; resultColumnItr++) {
                bufferedWriter.write(String.valueOf(result[resultRowItr][resultColumnItr]));

                if (resultColumnItr != result[resultRowItr].length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            if (resultRowItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
