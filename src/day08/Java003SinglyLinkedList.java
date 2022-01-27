package day08;

import java.util.Arrays;
import java.util.LinkedList;

class Node<E> {
    E item;
    Node<E> next;
    public Node(E item,Node<E> next){
        this.item=item;
        this.next=next;
    }
}

class SinglyLinkedList<E> {
    private int size;
    private Node<E> head;
    private Node<E> tail;

    public SinglyLinkedList() {}

    /* public void add(E value) {
        Node newNode = new Node(value,null);
        if(this.size==0){
            this.head = newNode;
            this.tail = newNode;
            this.size++;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
            this.size++;
        }
    }*/

    public void add(E value) {
        add(this.size,value);
    }

    public void addFirst(E value) {
        add(0,value);
    }

    public void addLast(E value) {
        add(this.size,value);
    }

    public boolean remove(E value) {
        if(this.size==0){
            return false;
        }
        else {
           Node curNode = this.head;
           for (int i=1;i<this.size;i++){
               if(curNode.item==value){
                   Node tmp = curNode.next;
                   Node prevNode = _getPrevNodeFromIndex(i);
                   prevNode.next = tmp;
                   return true;
               }
               curNode = curNode.next;
           }
        }
            return false;
    }




    public Node _getPrevNodeFromIndex(int index) {
        Node n = this.head;
        for (int i = 1; i<index-1;i++){
            n = n.next;
        }
        return n;
    }

    public void add(int index,E value) {
        Node newNode = new Node(value,null);
        if(this.size==0){
            this.head = newNode;
            this.tail = newNode;
            this.size++;
        } else if(index==0){
          newNode.next = this.head;
          this.head = newNode;
          this.size++;
        }
        else if(index==this.size) {
            this.tail.next = newNode;
            this.tail = newNode;
            this.size++;
        }
        else if(index>0  && index == this.size-1){
            this.tail.next = newNode;
            this.tail = newNode;
            this.size++;
        }
        else if(index>0 && index<this.size){
            Node prevNode = _getPrevNodeFromIndex(index);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
            this.size++;
        }
        else {
            return;
        }
    }

    public void printValues() {
        Node n = this.head;
        while (n!=null) {
            System.out.print(n.item+" ,");
            n = n.next;
        }
    }

    public void reverse() {
        Node rev = this.head; // A->B->C->D->E->F->G
        Node pointer = rev.next; // B->C->D->E->F->G
        rev.next = null; // so now rev => A->NULL

        // rev           => A->NULL
        // POINTER       => B->C->D->E->F->G
        // rev should be => B->A->NULL
        //so , C->D->E->F->G should be stored somewhere
        while (pointer!=null) {
            //Node tmp = pointer; //B->C->D->E->F->G
            //pointer = pointer.next;
            //tmp.next = rev;
            //rev = tmp;
            Node tmp = pointer.next;//C->D->E->F->G
            pointer.next = rev; // so pointer will be , B->A->NULL
            rev = pointer; // rev B->A->NULL
            pointer = tmp; // C->D->E->F->G

        }
        this.tail = this.head;
        this.head = rev;



    }

    public int getSize(){
        return this.size;
    }

}

public class Java003SinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList<String> s = new SinglyLinkedList<>();
        s.add("Hello");
        s.add("Heyy");
        s.add("Haii");
        s.addFirst("im first");
        s.addLast("im last");
        s.add(3,"inserting 3rd guy");
        s.printValues();
        System.out.println();
        s.reverse();
        s.remove("Haii");
        s.printValues();


    }
}
