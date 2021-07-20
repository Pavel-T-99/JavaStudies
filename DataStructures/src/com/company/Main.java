package com.company;

public class Main {

    public static void main(String[] args) {

        //Stack driver code
        StackArray stackArray = new StackArray(6);


        stackArray.push(10);
        stackArray.push(5);
        stackArray.push(1);
        stackArray.push(35);
        stackArray.push(3);
        stackArray.push(23);

        System.out.println(stackArray.toString());

        //Queue driver code
        Queue myQueue = new Queue(4);
        myQueue.insert(10);
        myQueue.insert(2);
        myQueue.insert(5);
        myQueue.insert(3);

        myQueue.remove();

        myQueue.insert(7);
        System.out.println(myQueue.peekFront());
        System.out.println(myQueue.peekRear());
        System.out.println(myQueue.toString());


        //Priority Queue driver code
        PriorityQueue priorityQueue = new PriorityQueue(7);
        priorityQueue.insert(10);
        priorityQueue.insert(1);
        priorityQueue.insert(55);
        priorityQueue.insert(64);
        priorityQueue.insert(25);
        priorityQueue.insert(11);
        priorityQueue.insert(3);

        System.out.println(priorityQueue.toString());

        System.out.println(priorityQueue.peek());

        System.out.println(priorityQueue.getSize());

        priorityQueue.remove();
        priorityQueue.remove();

        System.out.println(priorityQueue.getSize());

    //Adjacency graph driver code

        AdjacencyListGraph<Integer> graph = new AdjacencyListGraph<>();

        graph.addEdge(1, 2);
        graph.addEdge(1, 5);
        graph.addEdge(2, 5);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 1);

        System.out.println(graph.toString());


        //Cycle driver code
        //Cycle c = new Cycle();
        //c.start();
        //c.printAll();


        //SinglyLinkedList driver code

        SinglyLinkedList list = new SinglyLinkedList();
        assert list.isEmpty();
        assert list.size() == 0 && list.count() == 0;
        assert list.toString().equals("");

        list.insertHead(1);
        list.insertHead(7);
        list.insertHead(10);
        list.insert(3);
        list.insertNth(11, 4);

        System.out.println(list.search(10));
        System.out.println(list.search(3));
        System.out.println(list.search(11));

        list.deleteHead();
        list.deleteNth(1);
        list.delete();


        list.clear();
        assert list.isEmpty();


    }
}
