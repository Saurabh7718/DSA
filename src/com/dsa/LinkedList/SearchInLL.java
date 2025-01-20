package com.dsa.LinkedList;



class Node2 {
    int data;
    Node2 next;
    Node2 head;

    public Node2(int data2, Node2 next) {
        this.next = next;
        this.data = data2;
    }

    public Node2(int data2) {
        this.next = null;
        this.data = data2;
    }
    public Node2() {

    }




    public Node2 convertArr2LL2(int[] arr) {
        head = new Node2(arr[0]);
        Node2 mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node2 temp = new Node2(arr[i]);
            mover.next = temp;
            mover = temp;  //mover=mover.next;
        }

        return head;
    }

    public int count(Node2 head){
        int count=0;
        Node2 temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }


        return count;
    }

    public boolean searchElementInLL(int data, Node2 head){
        int count=0;
        boolean bool=false;
        Node2 temp=head;
        while(temp!=null){
            if(temp.data==data){
                bool=true;
            }
            else{
                bool=false;
            }
            temp=temp.next;

        }
        return bool;

    }


}
public class SearchInLL {
    public static void main(String[] args){
        int []arr2={1,4,7,10};
        Node2 z=new Node2();
        Node2 head = z.convertArr2LL2(arr2);
        int num=0;
        System.out.println("Element is "+ z.searchElementInLL(num, head));


    }
}
