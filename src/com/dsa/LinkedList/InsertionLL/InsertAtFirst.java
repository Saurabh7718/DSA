package com.dsa.LinkedList.InsertionLL;

class Node {
    int data;
    Node head;
    Node next;


    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node() {

    }

    public Node arrayToLL(int[] arr) {
        head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }


        return head;
    }

    public Node insertAtFirst(int value, Node head) {


        Node InsertNode = new Node(value);
        InsertNode.next = head;
        head = InsertNode;
        return head;

    }


}

public class InsertAtFirst {

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 9, 11};
        Node n = new Node();
        Node head = n.arrayToLL(arr);
        System.out.println(head.data);

        int value = 1000;
        head=n.insertAtFirst(value, head);


        Node temp = head;
        System.out.println("traversal");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
