//Copied this code.

import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    int addLeaf=0;
    public int getResult() {
        return addLeaf;
    }

    public void visitNode(TreeNode node) {
        //this will not be called
    }

    public void visitLeaf(TreeLeaf leaf) {
        addLeaf+=leaf.getValue();
    }
    
    
    
}

class ProductOfRedNodesVisitor extends TreeVis {
    long prod=1l;
    long mod=1000000007l;
 

    public int getResult() {
        return (int)prod;
    }

    public void visitNode(TreeNode node) {        
        if(node.getColor()==Color.RED)
            prod=(prod*node.getValue())%mod;
    }

    public void visitLeaf(TreeLeaf leaf) {        
        if(leaf.getColor()==Color.RED)
            prod=(prod*leaf.getValue())%mod;
    }
}

class FancyVisitor extends TreeVis {
    int sumNonLeafEvenDepth=0,sumGreenLeaf=0;
    
    public int getResult() {
        int x=sumNonLeafEvenDepth - sumGreenLeaf;
        if(x<0)x*=-1;
        
        return x;
    }

    public void visitNode(TreeNode node) {
        if(node.getDepth()%2==0 || node.getDepth()==0)
            sumNonLeafEvenDepth+=node.getValue();
    }

    public void visitLeaf(TreeLeaf leaf) {
        if(leaf.getColor()==Color.GREEN)
            sumGreenLeaf+=leaf.getValue();
    }
}


class Node{
    ArrayList<Node> lis;
    int val=0;
}



public class Solution {
    static BufferedReader br;
    static Node[] adjList;
  
    static boolean visit[];

    static void traverseAndPopulate(Integer N, String[] nVal, String[] cVal, Tree[] arr) {
        visit=new boolean[N];
        
        traverseMe(N,0,0,nVal,cVal,arr,0);
    }
   
    static Tree traverseMe(int N,int node, int parent,String[] nVal, String[] cVal, Tree[] arr,int depth_Of_Node) {
        
        visit[node]=true;//
        Iterator<Node> itr=adjList[node].lis.iterator();
        
        while(itr.hasNext()) {
            Node nn=itr.next();
            if(!visit[nn.val]) {
                Tree child=traverseMe(N,nn.val,node,nVal,cVal,arr,depth_Of_Node+1);
                if(arr[node]==null) {
                    arr[node]=getNode(true,nVal,cVal,node,arr,depth_Of_Node);
                }
                ((TreeNode) arr[node]).addChild(child);
            }
        }
        if(arr[node]==null) {
            arr[node]=getNode(false,nVal,cVal,node,arr,depth_Of_Node);
        }
        return arr[node];
    }
    
    static Tree getNode(boolean flag,String[] nVal, String[] cVal, int node,Tree[] arr, int depth_Of_Node) {
        int val=Integer.valueOf(nVal[node]);
        int col=Integer.valueOf(cVal[node]);
        Color color=(col==0)?Color.RED:Color.GREEN;

        arr[node]=(flag==true)?new TreeNode(val,color,depth_Of_Node):new TreeLeaf(val,color,depth_Of_Node);
        return arr[node];
    }
    
    
    public static Tree solve() {
        br=new BufferedReader(new InputStreamReader(System.in));
        Tree root=null; 
        Integer N = null;
        String[] nVal,cVal;
        int i;
        Tree arr[] = null; 
        try {
            N=Integer.valueOf(br.readLine());
            nVal=br.readLine().split(" ");
            cVal=br.readLine().split(" ");
            String edge[];
            int val1=0,val2=0;
            int col1=0,col2=0;

            arr= new Tree[N];
            arr[0]=new TreeNode(Integer.valueOf(nVal[0]),(Integer.valueOf(cVal[0])==0)?Color.RED:Color.GREEN,0);

            i=0;
            adjList=new Node[N];

            for(int k=0;k<N;k++) {
                adjList[k]=new Node();
                adjList[k].lis=new ArrayList<Node>();
                adjList[k].val=k;
            }
            
            while(i<N-1){
                edge=br.readLine().split(" ");
                int v1,v2;
                v1=Integer.valueOf(edge[0])-1;
                v2=Integer.valueOf(edge[1])-1;
                    adjList[v1].lis.add(adjList[v2]);
                if(!adjList[v2].lis.contains(adjList[v1]))
                    adjList[v2].lis.add(adjList[v1]);
                    
                i++;
            }
            br.close();
            
            traverseAndPopulate(N,nVal,cVal,arr);
                            
        }catch(IOException er) {}
        
        root=arr[0];
        return root;
    }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}