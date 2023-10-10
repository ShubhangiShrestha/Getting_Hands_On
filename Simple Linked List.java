import java.util.*;
import java.lang.reflect.Array;
class SimpleLinkedList<T> {
    private Node startingNode;
    private int sizeOfLinkedList;
    private class Node{
        T value;
        Node nextNode;
        Node(T value){
            this.value=value;
            this.nextNode=null;
        }
    }
    SimpleLinkedList() {
        this.startingNode=null;
        this.sizeOfLinkedList=0;
    }

    SimpleLinkedList(T[] values) {
        for (int i = values.length - 1; i >= 0; i--) {
            push(values[i]);
        }
    }

    void push(T value) {
        Node newNode = new Node(value);
        newNode.nextNode=startingNode;
        startingNode=newNode;
        sizeOfLinkedList++;
    }
}