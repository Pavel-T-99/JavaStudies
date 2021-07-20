package com.company;

import java.util.StringJoiner;

class Node{
    int value; // value of the node
    Node next; // point to the next node

    Node(){}

    Node(int value){
        this(value, null);
    }

    Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
}

public class SinglyLinkedList {

    private Node head; //front of the list
    private int size; //size of the list

    public SinglyLinkedList(){
        head = null;
        size = 0;
    }

    public SinglyLinkedList(Node head, int size){
        this.head = head;
        this.size = size;
    }

    public void insertHead(int x){ //x element to be added
        insertNth(x, 0);
    }

    public void insert(int data){ //insert element at the tail of the list
        insertNth(data, size);
    }

    public void insertNth(int data, int position){ //inserts a new node at a specified position of the list
        checkBounds(position, 0, size);
        Node newNode = new Node(data);
        if(head == null){ //the list is empty
            head = newNode;
            size++;
        }else if(position == 0){
            newNode.next = head; // insert at the head of the list
            head = newNode;
            size++;
            return;
        }

        Node current = head;
        for(int i = 0; i < position; ++i){
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public void deleteHead(){ //delete a node at the head
        deleteNth(0);
    }

    public void delete(){ // delete an element at the tail
        deleteNth(size - 1);
    }

    public void deleteNth(int position){//delete an element at the N-th position
        checkBounds(position, 0, size - 1);
        if(position == 0){
            Node destroy = head;
            head = head.next;
            destroy = null;
            size--;
            return;
        }

        Node current = head;
        for(int i = 0; i < position - 1; ++i){
            current = current.next;
        }

        Node destroy = current.next;
        current.next = current.next.next;
        destroy = null;

        size--;
    }

    public void checkBounds(int position, int low, int high){ //method to check the bounds of the list
        if(position > high || position < low){
            throw new IndexOutOfBoundsException(position + "");
        }
    }

    public void clear(){
        Node current = head;
        while(current != null){
            Node previous = current;
            current = current.next;
            previous = null;
        }
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Node getHead(){
        return head;
    }

    public int count(){ // calculate the count of the list
        int count = 0;
        Node current = head;
        while(current != null){
            current = current.next;
            count++;
        }
        return count;
    }

    public boolean search(int key){
        Node current = head;
        while(current != null){
            if (current.value == key){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int getNth(int index) {
        checkBounds(index, 0, size - 1);
        Node current = head;
        for (int i = 0; i < index; ++i) {
            current = current.next;
        }
        return current.value;
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner("->");
        Node current = head;
        while (current != null) {
            joiner.add(current.value + "");
            current = current.next;
        }
        return joiner.toString();
    }
}
