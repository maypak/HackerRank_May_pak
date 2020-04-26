import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode node1 = head1;
        SinglyLinkedListNode node2 = head2;
        SinglyLinkedListNode t;
        SinglyLinkedListNode tNode;

        if(node1.data <= node2.data) {
            t = new SinglyLinkedListNode(node1.data);
            node1 = node1.next;
        } else {
            t = new SinglyLinkedListNode(node2.data);
            node2 = node2.next;
        }
        tNode = t;

        while(node1 != null && node2 != null) {
            if(node1.data <= node2.data) {
                tNode.next = new SinglyLinkedListNode(node1.data);
                node1 = node1.next;
            } else {
                tNode.next = new SinglyLinkedListNode(node2.data);
                node2 = node2.next;
            }
            tNode = tNode.next;
        }
        if(node1 == null) {
            tNode.next = node2;
        } else {
            tNode.next = node1;
        }
        return t;
    }

    private static final Scanner scanner = new Scanner(System.in);