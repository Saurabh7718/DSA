package com.dsa.LinkedList.InsertionLL;

class Node2 {
    int data;
    Node2 head;
    Node2 next;

    Node2(int data, Node2 next) {
        this.data = data;
        this.next = next;

    }


    Node2(int data) {
        this.data = data;
        this.next = null;
    }

    Node2() {

    }

    public Node2 arrayToLL(int[] arr) {
        head = new Node2(arr[0]);
        Node2 mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node2 temp = new Node2(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }

        return head;
    }

    public Node2 insertAtKPosition(int data, int position) {
        Node2 temp1 = head;
        if(position==0){
            Node2 n=new Node2(data);
            n.next=head;
            head=n;

        }


        for (int i = 0; i < position-1; i++) {
           if(temp1==null){
               System.out.println("position is out of range         ");
               return null;
           }
            temp1=temp1.next;

        }

        Node2 n = new Node2(data);
        n.next=temp1.next;
        temp1.next = n;
        return head;
    }

}


public class InsertAtKthPosition {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        Node2 n = new Node2();
        Node2 head = n.arrayToLL(arr);

        int position = 2;
        int value = 40;

        head = n.insertAtKPosition(value, position);
        Node2 temp=head;
        System.out.println("traversal");

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;


        }
    }
}
