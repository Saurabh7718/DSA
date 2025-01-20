package com.dsa.LinkedList;

import java.util.ArrayList;
import java.util.List;

class Node1 {
    int data;
    Node1 next;
    Node1 head;

    public Node1(int data1, Node1 next) {
        this.next = next;
        this.data = data1;
    }

    public Node1(int data1) {
        this.next = null;
        this.data = data1;
    }

    public Node1() {

    }


    Node1 convertArr2LL(int[] arr) {
        head = new Node1(arr[0]);
        Node1 mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node1 temp = new Node1(arr[i]);
            mover.next = temp;
            mover = temp;  //mover=mover.next;
        }

        return head;
    }

    public int count(Node1 head){
        int count=0;
        Node1 temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }


        return count;
    }




}


public class arrayToLL {
    public static void main(String[] args) {
        System.out.println("misn");
        int[] arr = {100, 2, 3, 4, 5};
        Node1 y = new Node1();
        Node1 head = y.convertArr2LL(arr);
        System.out.println(head.data);

        //Node1 x=new Node1();

        System.out.println("count is "+y.count(head));
        //traversal LL

        Node1 temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }



    }
}
